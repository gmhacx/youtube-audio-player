package com.github.kotvertolet.youtubeaudioplayer.data.models.youtubeSearch;

import com.google.gson.annotations.SerializedName;

public class High {

    @SerializedName("width")
    private int width;

    @SerializedName("url")
    private String url;

    @SerializedName("height")
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return
                "High{" +
                        "width = '" + width + '\'' +
                        ",url = '" + url + '\'' +
                        ",height = '" + height + '\'' +
                        "}";
    }
}