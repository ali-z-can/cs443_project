package com.cs443.project.userpastlinkanalyticsretrievalservice;

import java.math.BigDecimal;

public class ToSend {
    private BigDecimal clicks;
    private BigDecimal links;
    private int numberOfUser;

    public ToSend() {
    }

    public ToSend(BigDecimal clicks, BigDecimal links, int numberOfUser) {
        this.clicks = clicks;
        this.links = links;
        this.numberOfUser = numberOfUser;
    }

    public BigDecimal getClicks() {
        return clicks;
    }

    public void setClicks(BigDecimal clicks) {
        this.clicks = clicks;
    }

    public BigDecimal getLinks() {
        return links;
    }

    public void setLinks(BigDecimal links) {
        this.links = links;
    }

    public int getNumberOfUser() {
        return numberOfUser;
    }

    public void setNumberOfUser(int numberOfUser) {
        this.numberOfUser = numberOfUser;
    }
}
