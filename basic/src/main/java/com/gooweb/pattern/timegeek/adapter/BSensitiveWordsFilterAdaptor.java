package com.gooweb.pattern.timegeek.adapter;

/**
 * @author steng
 * @description
 * @date 2020-06-05 10:51 上午
 **/
public class BSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {

    private BSensitiveWordsFilter bFilter;

    @Override
    public String filter(String text) {
        String maskedText = bFilter.filter(text);
        return maskedText;
    }
}
