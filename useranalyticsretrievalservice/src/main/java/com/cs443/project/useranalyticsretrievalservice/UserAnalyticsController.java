package com.cs443.project.useranalyticsretrievalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAnalyticsController {

    @Autowired
    UserPastLinkAnalyticsServiceProxy pastProxy;

    @Autowired
    UserLinkAnalyticsServiceProxy proxy;

    @CrossOrigin
    @GetMapping("/user/{id}/user-analytics")
    public UserAnalyticsBean retrieve(@PathVariable Long id){
         List<Link> userLinks = proxy.retrieveUserLinkAnalytics(id);
         UserLinkAnalyticsBean userAnalyticsBean = new UserLinkAnalyticsBean(userLinks);

         UserPastLinkAnalyticsBean userPastLinkAnalyticsBean = pastProxy.retrievePastUserLinkAnalytics(id);

        return new UserAnalyticsBean(userAnalyticsBean,userPastLinkAnalyticsBean);

    }
}
