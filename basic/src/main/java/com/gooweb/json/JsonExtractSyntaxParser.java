package com.gooweb.json;

/**
 * json字段值提取语法解析器
 * @author steng
 * @date 2020-11-24 09:38
 **/
public class JsonExtractSyntaxParser {

    private static final String JSON_EXTRACT_SYNTAX_SPLITTER = "/";


    public static JsonExpression parse(String jsonExtractSyntax){
        JsonExpression rootJsonExpression= null;

        CompositeJsonExpression currentJsonExpression = null;

        String[] elements = jsonExtractSyntax.split(JSON_EXTRACT_SYNTAX_SPLITTER);

        for(int i = 0; i < elements.length; i++){
            if(i == 0){
                if(elements.length == 1){
                    rootJsonExpression = new LeafJsonExpression(elements[i]);
                } else {
                    rootJsonExpression = new CompositeJsonExpression(elements[i]);
                    currentJsonExpression = (CompositeJsonExpression) rootJsonExpression;
                }
            } else if(i < elements.length - 1) {
                CompositeJsonExpression childJsonExpression = new CompositeJsonExpression(elements[i]);
                currentJsonExpression.setChildJsonExpression(childJsonExpression);
                currentJsonExpression = childJsonExpression;
            } else {
                LeafJsonExpression childJsonExpression = new LeafJsonExpression(elements[i]);
                currentJsonExpression.setChildJsonExpression(childJsonExpression);
            }
        }

        return rootJsonExpression;
    }
}
