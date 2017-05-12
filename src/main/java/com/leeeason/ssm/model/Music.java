package com.leeeason.ssm.model;

import java.io.Serializable;

/**
 * Created by AL on 0009 09 05.
 */
public class Music implements Serializable{

    private String title;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Music music = (Music) o;

        if (title != null ? !title.equals(music.title) : music.title != null) return false;
        return url != null ? url.equals(music.url) : music.url == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
