package com.cs443.project.adminstatisticsservice;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="inner-gateway")
@RibbonClient(name = "link-retrieval-service")
public interface LinkAnalyticsProxy {

    @GetMapping("/link-retrieval-service/admin/linkStatsRetrieval")
    public ToRetLink linkStatsRetrieval();

}