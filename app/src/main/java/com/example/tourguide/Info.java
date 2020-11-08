package com.example.tourguide;

 class Infos {
    private String defaultInfo;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Infos(String DefaultInfo, int imageResourceId){
        this.defaultInfo =DefaultInfo;

        this.mImageResourceId = imageResourceId;

    }
    public int getImageResourceId () {
        return mImageResourceId;
    }
    public String getDefaultInfo(){
        return defaultInfo;
    }

    public boolean hasImage () {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
