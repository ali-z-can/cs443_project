package com.cs443.project.redirectionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "linkretrievalservice")
public interface LinkRetrievalServiceProxy {

    @GetMapping("/link-retrieval/{short_url}")
    public LinkRedirectionBean retrieveExchangeValue(@PathVariable String short_url);

}
