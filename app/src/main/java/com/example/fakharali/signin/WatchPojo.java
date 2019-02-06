package com.example.fakharali.signin;

/**
 * Created by Fakhar Ali on 1/25/2019.
 */

public class WatchPojo {
    int image;
    String title;
    String description;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WatchPojo(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;

    }
}
