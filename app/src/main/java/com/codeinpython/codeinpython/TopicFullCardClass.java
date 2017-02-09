package com.codeinpython.codeinpython;

 class TopicFullCardClass {
    private String mTitle;
    private int mTopicImage;
    private String mFirst;
    private String mSecond;
    private String mThird;
    private String mFourth;
    private String mFive;
    private String mSixth;

     TopicFullCardClass(String Title, int TopicImage, String mFirst, String mSecond, String mThird, String mFourth, String mFive, String mSixth)
    {
        this.mTitle = Title;
        this.mTopicImage = TopicImage;
        this.mFirst = mFirst;
        this.mSecond = mSecond;
        this.mThird = mThird;
        this.mFourth = mFourth;
        this.mFive = mFive;
        this.mSixth = mSixth;
    }

     String getmTitle() {
        return mTitle;
    }

     int getmTopicImage() {
        return mTopicImage;
    }

     String getmFirst() {
        return mFirst;
    }

     String getmSecond() {
        return mSecond;
    }

     String getmThird() {
        return mThird;
    }

     String getmFourth() {
        return mFourth;
    }

     String getmFive() {
        return mFive;
    }

     String getmSixth() {
        return mSixth;
    }

}
