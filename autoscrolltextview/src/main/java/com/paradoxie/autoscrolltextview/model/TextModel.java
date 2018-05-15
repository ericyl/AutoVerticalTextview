package com.paradoxie.autoscrolltextview.model;

/**
 * @author ericyl on 2018/5/15.
 */
public class TextModel<T> {
    private String title;
    private T obj;

    public TextModel() {
    }

    public TextModel(String title) {
        this.title = title;
    }

    public TextModel(String title, T obj) {
        this.title = title;
        this.obj = obj;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
