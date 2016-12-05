package ydkf.niit.cn.bean;

import android.content.Context;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import ydkf.niit.cn.ui.fragment.NoticeFragment;

/**
 * Created by zhdk on 2016/12/5.
 */
public class NoticeBean {
    private String name;
    private String content;
    private String title;

    public NoticeBean(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
