package com.cs443.project.redirectionservice;

public class LinkRedirectionBean {

    private Long id;
    private Long userId;
    private String shortUrl;
    private String longUrl;
    private Long numberOfClicks;
    private int port;

    public LinkRedirectionBean(Long linkId, Long userId, String shortUrl, String longUrl, Long numberOfClicks, int port) {
        this.id = linkId;
        this.userId = userId;
        this.shortUrl = shortUrl;
        this.longUrl = longUrl;
        this.numberOfClicks = numberOfClicks;
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public LinkRedirectionBean(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Long getNumberOfClicks() {
        return numberOfClicks;
    }

    public void setNumberOfClicks(Long numberOfClicks) {
        this.numberOfClicks = numberOfClicks;
    }
}
