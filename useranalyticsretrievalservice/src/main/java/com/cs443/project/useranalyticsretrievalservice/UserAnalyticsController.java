package com.cs443.project.useranalyticsretrievalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAnalyticsController {

    @Autowired
    UserPastLinkAnalyticsServiceProxy pastProxy;

    @Autowired
    UserLinkAnalyticsServiceProxy proxy;

    @GetMapping("/user/{id}/user-analytics")
    public UserAnalyticsBean retrieve(@PathVariable Long id){
        UserLinkAnalyticsBean userAnalyticsBean = proxy.retrieveUserLinkAnalytics(id);
        UserPastLinkAnalyticsBean userPastLinkAnalyticsBean = pastProxy.retrievePastUserLinkAnalytics(id);

        return new UserAnalyticsBean(userAnalyticsBean,userPastLinkAnalyticsBean);

    }
}
