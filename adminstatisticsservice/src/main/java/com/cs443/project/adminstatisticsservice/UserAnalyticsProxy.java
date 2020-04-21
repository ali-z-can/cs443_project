package com.cs443.project.adminstatisticsservice;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="inner-gateway")
@RibbonClient(name = "user-past-link-analytics-retrieval-service")
public interface UserAnalyticsProxy {

    @GetMapping("/user-past-link-analytics-retrieval-service/admin/getUserStats")
    public ToSendUser getUserStats();

}
