package com.gooweb.pattern.timegeek.adapter;

/**
 * @author steng
 * @description
 * @date 2020-06-05 10:53 上午
 **/
public class CSensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {

    private CSensitiveWordsFilter cFilter;

    @Override
    public String filter(String text) {
        String maskedText = cFilter.filter(text,"");
        return maskedText;
    }
}
