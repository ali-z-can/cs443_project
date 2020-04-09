package com.cs443.project.useranalyticsretrievalservice;

import java.util.List;

public class UserLinkAnalyticsBean {

    private List<Link> userLinks;

    public List<Link> getUserLinks() {
        return userLinks;
    }

    public void setUserLinks(List<Link> userLinks) {
        this.userLinks = userLinks;
    }

    public UserLinkAnalyticsBean(List<Link> userLinks) {
        this.userLinks = userLinks;
    }
}