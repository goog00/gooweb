package com.gooweb.pattern.observer.v1;

/**
 * @author sunteng
 * @date 2019-11-21 下午 9:00
 **/
public class ConcreteSubject extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
