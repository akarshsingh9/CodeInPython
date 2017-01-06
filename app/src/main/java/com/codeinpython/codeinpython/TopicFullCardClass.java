package com.codeinpython.codeinpython;

public class TopicFullCardClass {
    private String mTitle;
    private int mTopicImage;
    public TopicFullCardClass(String Title, int TopicImage)
    {
        this.mTitle = Title;
        this.mTopicImage = TopicImage;
    }

    public String getmTitle() {
        return mTitle;
    }

    public int getmTopicImage() {
        return mTopicImage;
    }
}
