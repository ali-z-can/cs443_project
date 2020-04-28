package com.cs443.project.adminstatisticsservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="userpastlinkanalyticsretrievalservice")
public interface UserAnalyticsProxy {

    @GetMapping("/admin/getUserStats")
    public ToSendUser getUserStats();

}
