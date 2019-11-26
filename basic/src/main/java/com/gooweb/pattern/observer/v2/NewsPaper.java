package com.gooweb.pattern.observer.v2;

/**
 * 报纸对象，具体的目标实现
 *
 * @author sunteng
 * @date 2019-11-22 上午 8:33
 **/
public class NewsPaper extends Subject {

    /**
     * 报纸的具体内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //内容有了，说明又出报纸了，那就通知所有的读者
        notifyObservers();

    }
}
