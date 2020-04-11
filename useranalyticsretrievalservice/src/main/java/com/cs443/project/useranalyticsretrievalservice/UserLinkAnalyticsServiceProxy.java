package com.cs443.project.useranalyticsretrievalservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="inner-gateway")
@RibbonClient(name = "link-retrieval-service")
public interface UserLinkAnalyticsServiceProxy {

    @GetMapping("/link-retrieval-service/links-retrieval/user/{id}")
    public UserLinkAnalyticsBean retrieveUserLinkAnalytics(@PathVariable Long userId);

}