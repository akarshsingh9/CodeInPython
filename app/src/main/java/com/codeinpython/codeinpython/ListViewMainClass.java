package com.codeinpython.codeinpython;


public class ListViewMainClass {

    private String title;
    private int icon;
    private String description;
    private int bgcolor;

    public ListViewMainClass(String title, int icon,String description,int bgcolor)
    {
        this.title = title;
        this.icon = icon;
        this.description = description;
        this.bgcolor = bgcolor;
    }

    public String getTitle() {
        return title;
    }

    public int getIcon() {
        return icon;
    }

    public String getDescription() {
       return description;
   }

    public int getBgcolor() {
        return bgcolor;
    }
}

