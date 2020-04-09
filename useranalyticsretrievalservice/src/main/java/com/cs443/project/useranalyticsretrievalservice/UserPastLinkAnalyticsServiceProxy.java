package com.cs443.project.useranalyticsretrievalservice;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="inner-gateway")
@RibbonClient(name = "user-past-link-analytics-retrieval-service")
public interface UserPastLinkAnalyticsServiceProxy {


    @GetMapping("/user-past-link-analytics-retrieval-service/user/{userid}/get-past-analytics")
    public UserPastLinkAnalyticsBean retrievePastUserLinkAnalytics(@PathVariable Long id);

}
