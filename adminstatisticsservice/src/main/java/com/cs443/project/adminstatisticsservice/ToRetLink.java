package com.cs443.project.adminstatisticsservice;


public class ToRetLink {

    private int clicks;
    private int links;

    public ToRetLink(int clicks, int links) {
        this.clicks = clicks;
        this.links = links;
    }

    public ToRetLink() {
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

