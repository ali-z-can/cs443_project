package com.cs443.project.redirectionservice;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inner-gateway")
@RibbonClient(name = "link-retrieval-service")
public interface IncremationProxy {

    @GetMapping("/link-analytics-service/link-click-increment/link/{linkId}")
    public void increment(@PathVariable Long linkId);
}
