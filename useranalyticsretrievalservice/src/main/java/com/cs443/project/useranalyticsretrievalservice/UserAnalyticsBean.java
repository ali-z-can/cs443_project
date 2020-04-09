package com.cs443.project.useranalyticsretrievalservice;

public class UserAnalyticsBean {

    UserLinkAnalyticsBean userLinkAnalyticsBean;
    UserPastLinkAnalyticsBean userPastLinkAnalyticsBean;

    public UserLinkAnalyticsBean getUserLinkAnalyticsBean() {
        return userLinkAnalyticsBean;
    }

    public void setUserLinkAnalyticsBean(UserLinkAnalyticsBean userLinkAnalyticsBean) {
        this.userLinkAnalyticsBean = userLinkAnalyticsBean;
    }

    public UserPastLinkAnalyticsBean getUserPastLinkAnalyticsBean() {
        return userPastLinkAnalyticsBean;
    }

    public void setUserPastLinkAnalyticsBean(UserPastLinkAnalyticsBean userPastLinkAnalyticsBean) {
        this.userPastLinkAnalyticsBean = userPastLinkAnalyticsBean;
    }

    public UserAnalyticsBean(UserLinkAnalyticsBean userLinkAnalyticsBean, UserPastLinkAnalyticsBean userPastLinkAnalyticsBean) {
        this.userLinkAnalyticsBean = userLinkAnalyticsBean;
        this.userPastLinkAnalyticsBean = userPastLinkAnalyticsBean;
    }
}
