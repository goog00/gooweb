package com.gooweb.json;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;


/**
 * json表达式上下文
 * @author steng
 * @date 2020-11-23 19:57
 **/
@Data
public class JsonExpressionContext {


    /**
     * 目标json
     */
    private JSONObject targetJson;

    /**
     * 当前节点
     */
    private JSONObject currentJsonNode;


    public JsonExpressionContext(JSONObject targetJson){
        this.targetJson = targetJson;
    }


}
