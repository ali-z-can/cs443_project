package com.cs443.project.useranalyticsretrievalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="linkretrievalservice")
public interface UserLinkAnalyticsServiceProxy {

    @GetMapping("/links-retrieval/user/{userId}")
    public List<Link> retrieveUserLinkAnalytics(@PathVariable Long userId);

}
