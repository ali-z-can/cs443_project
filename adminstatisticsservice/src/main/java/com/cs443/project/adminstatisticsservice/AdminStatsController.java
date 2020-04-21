package com.cs443.project.adminstatisticsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminStatsController {

    @Autowired
    UserAnalyticsProxy userAnalyticsProxy;

    @Autowired
    LinkAnalyticsProxy linkAnalyticsProxy;

    @CrossOrigin
    @GetMapping("/admin/getStats")
    public AdminStatBean retrieve(){

        AdminStatBean adminStatBean = new AdminStatBean();
        adminStatBean.setToRetLink(linkAnalyticsProxy.linkStatsRetrieval());
        adminStatBean.setToSendUser(userAnalyticsProxy.getUserStats());
        return adminStatBean;
    }
}
