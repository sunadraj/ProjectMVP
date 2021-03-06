package com.example.projectmvp.responses;

import android.media.Image;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Fields {

    @SerializedName("Profile Picture")
    @Expose
    private List<ProfilePicture> profilePicture;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Images")
    @Expose
    private List<Images> images;
    @SerializedName("Videos")
    @Expose
    private List<Video> videos;
    @SerializedName("Caption")
    @Expose
    private String caption;

    public List<ProfilePicture> getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(List<ProfilePicture> profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

    public String getCaption() {
        return caption;
    }
    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }

}
