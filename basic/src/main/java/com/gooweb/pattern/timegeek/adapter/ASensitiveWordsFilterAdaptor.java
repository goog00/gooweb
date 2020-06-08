package com.gooweb.pattern.timegeek.adapter;

/**
 * @author steng
 * @description
 * @date 2020-06-05 10:49 上午
 **/
public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter{

    private ASensitiveWordsFilter aFilter;

    @Override
    public String filter(String text) {
        String maskedText = aFilter.filterSexyWords(text);
        maskedText = aFilter.filterPoliticalWords(maskedText);
        return maskedText;
    }

}
