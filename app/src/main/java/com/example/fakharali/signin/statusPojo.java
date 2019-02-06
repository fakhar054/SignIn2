package com.example.fakharali.signin;

/**
 * Created by Fakhar Ali on 2/4/2019.
 */

public class statusPojo {

    int images;
    String titles;
    public statusPojo(int images, String titles) {
        this.titles = titles;
        this.images = images;


    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }


}
