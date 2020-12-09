package com.gooweb.json;

/**
 * @author steng
 * @date 2020-11-23 19:56
 **/
public interface JsonExpression {

    /**
     * 解释表达式
     * @param context 上下文
     * @return 结果
     */
    Object interpret(JsonExpressionContext context);
}
