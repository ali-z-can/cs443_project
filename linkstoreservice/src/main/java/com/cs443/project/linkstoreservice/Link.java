package com.cs443.project.linkstoreservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Link {

    @Id
    @GeneratedValue
    private Long id;
    private Long userId;
    private String shortUrl;
    private String longUrl;
    private int numberOfClicks;
    private int port;
    private Timestamp expiration;

    public Link(Long userId, String shortUrl, String longUrl, int numberOfClicks, int port, Timestamp expiration) {
        this.userId = userId;
        this.shortUrl = shortUrl;
        this.longUrl = longUrl;
        this.numberOfClicks = numberOfClicks;
        this.port = port;
        this.expiration = expiration;
    }

    public Timestamp getExpiration() {
        return expiration;
    }

    public void setExpiration(Timestamp expiration) {
        this.expiration = expiration;
    }



    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Link(){

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

    public int getNumberOfClicks() {
        return numberOfClicks;
    }

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", userId=" + userId +
                ", shortUrl='" + shortUrl + '\'' +
                ", longUrl='" + longUrl + '\'' +
                ", numberOfClicks=" + numberOfClicks +
                ", port=" + port +
                ", expiration=" + expiration +
                '}';
    }

    public void setNumberOfClicks(int numberOfClicks) {
        this.numberOfClicks = numberOfClicks;
    }

}
