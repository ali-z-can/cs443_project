package com.cs443.project.useranalyticsretrievalservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="userpastlinkanalyticsretrievalservice")
public interface UserPastLinkAnalyticsServiceProxy {


    @GetMapping("/user/{id}/get-past-analytics")
    public UserPastLinkAnalyticsBean retrievePastUserLinkAnalytics(@PathVariable Long id);

}
