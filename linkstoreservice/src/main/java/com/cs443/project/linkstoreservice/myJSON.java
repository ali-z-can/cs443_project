package com.cs443.project.linkstoreservice;

public class myJSON {

    private String shortUrl;
    private String longUrl;
    private int daysToBeAllive;

    public myJSON(String shortUrl, String longUrl, int daysToBeAllive) {
        this.shortUrl = shortUrl;
        this.longUrl = longUrl;
        this.daysToBeAllive = daysToBeAllive;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public int getDaysToBeAllive() {
        return daysToBeAllive;
    }

    public void setDaysToBeAllive(int daysToBeAllive) {
        this.daysToBeAllive = daysToBeAllive;
    }
}
