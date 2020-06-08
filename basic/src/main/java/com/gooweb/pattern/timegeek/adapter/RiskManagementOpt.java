package com.gooweb.pattern.timegeek.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author steng
 * @description
 * @date 2020-06-05 10:54 上午
 **/
public class RiskManagementOpt {

    private List<ISensitiveWordsFilter> filters = new ArrayList<>();

    public void addSensitiveWordFilter(ISensitiveWordsFilter filter){
        filters.add(filter);
    }

    public String filterSensitiveWords(String text){
        String maskedText = text;
        for (ISensitiveWordsFilter filter : filters){
            maskedText = filter.filter(maskedText);
        }
        return maskedText;
    }
}
