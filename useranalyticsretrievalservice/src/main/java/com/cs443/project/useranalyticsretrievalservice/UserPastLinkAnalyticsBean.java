package com.cs443.project.useranalyticsretrievalservice;

public class UserPastLinkAnalyticsBean {

    private Long userId;
    private int numberOfClicks;
    private int getNumberOfDistinctLinks;

    public UserPastLinkAnalyticsBean(Long userId, int numberOfClicks, int getNumberOfDistinctLinks) {
        this.userId = userId;
        this.numberOfClicks = numberOfClicks;
        this.getNumberOfDistinctLinks = getNumberOfDistinctLinks;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getNumberOfClicks() {
        return numberOfClicks;
    }

    public void setNumberOfClicks(int numberOfClicks) {
        this.numberOfClicks = numberOfClicks;
    }

    public int getGetNumberOfDistinctLinks() {
        return getNumberOfDistinctLinks;
    }

    public void setGetNumberOfDistinctLinks(int getNumberOfDistinctLinks) {
        this.getNumberOfDistinctLinks = getNumberOfDistinctLinks;
    }
}
