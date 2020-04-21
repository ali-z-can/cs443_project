package com.cs443.project.linkretrievalservice;


public class ToRet {

    private int clicks;
    private int links;

    public ToRet(int clicks, int links) {
        this.clicks = clicks;
        this.links = links;
    }

    public ToRet() {
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public int getLinks() {
        return links;
    }

    public void setLinks(int links) {
        this.links = links;
    }
}

