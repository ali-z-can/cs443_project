package com.cs443.project.adminstatisticsservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="linkretrievalservice")
public interface LinkAnalyticsProxy {

    @GetMapping("/admin/linkStatsRetrieval")
    public ToRetLink linkStatsRetrieval();

}