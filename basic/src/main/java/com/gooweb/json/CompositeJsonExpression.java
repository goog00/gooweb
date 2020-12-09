package com.gooweb.json;
import com.alibaba.fastjson.JSONObject;


/**
 * 用于组合别的表达式的json表达式
 * @author steng
 * @date 2020-11-23 20:01
 **/
public class CompositeJsonExpression implements JsonExpression {

    /**
     * json节点名称
     */
    private String jsonNodeName;

    /**
     * 子表达式
     */
    private JsonExpression childJsonExpression;

    public CompositeJsonExpression(String jsonNodeName) {
        this.jsonNodeName = jsonNodeName;
    }

    @Override
    public Object interpret(JsonExpressionContext context) {

        JSONObject currentJsonNode = context.getCurrentJsonNode();

        if(currentJsonNode == null){
            JSONObject targetJson = context.getTargetJson();
            currentJsonNode = targetJson.getJSONObject(jsonNodeName);
            context.setCurrentJsonNode(currentJsonNode);
        } else {
            currentJsonNode = currentJsonNode.getJSONObject(jsonNodeName);
            context.setCurrentJsonNode(currentJsonNode);
        }

        return childJsonExpression.interpret(context);
    }

    public void setChildJsonExpression(JsonExpression childJsonExpression) {
        this.childJsonExpression = childJsonExpression;
    }
}
