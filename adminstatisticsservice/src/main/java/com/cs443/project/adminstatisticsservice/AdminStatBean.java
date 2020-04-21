package com.cs443.project.adminstatisticsservice;

public class AdminStatBean {

    private ToRetLink toRetLink;
    private ToSendUser toSendUser;

    public AdminStatBean() {
    }

    public ToRetLink getToRetLink() {
        return toRetLink;
    }

    public void setToRetLink(ToRetLink toRetLink) {
        this.toRetLink = toRetLink;
    }

    public ToSendUser getToSendUser() {
        return toSendUser;
    }

    public void setToSendUser(ToSendUser toSendUser) {
        this.toSendUser = toSendUser;
    }

    public AdminStatBean(ToRetLink toRetLink, ToSendUser toSendUser) {
        this.toRetLink = toRetLink;
        this.toSendUser = toSendUser;
    }
}
