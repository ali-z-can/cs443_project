package com.cs443.project.linkdeletionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inner-gateway")
@RibbonClient(name = "user-past-link-analytics-rearrangement-service")
public interface ReArrangementProxy {

    @GetMapping("/user-past-link-analytics-rearrangement-service/rearrangement/user/{userID}/numberOfClicks/{numberOfClicks}")
    public boolean rearrange(@PathVariable Long userID, @PathVariable int numberOfClicks);


}