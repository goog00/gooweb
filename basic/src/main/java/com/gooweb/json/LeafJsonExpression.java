package com.gooweb.json;

import com.alibaba.fastjson.JSONObject;


/**
 * 叶子表达式
 * @author steng
 * @date 2020-11-24 09:41
 **/
public class LeafJsonExpression implements JsonExpression {


    private String jsonNodeName;

    public LeafJsonExpression(String jsonNodeName) {
        this.jsonNodeName = jsonNodeName;
    }

    @Override
    public Object interpret(JsonExpressionContext context) {
        JSONObject currentJsonNode = context.getCurrentJsonNode();
        if (currentJsonNode == null) {
            return context.getTargetJson().get(jsonNodeName);
        } else {
            return currentJsonNode.get(jsonNodeName);
        }

    }
}
