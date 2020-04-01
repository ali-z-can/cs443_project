package com.cs443.project.redirectionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkRedirectionController {

    @Autowired
    LinkRetrievalServiceProxy proxy;

    @GetMapping("/{shortUrl}")
    public LinkRedirectionBean redirect(@PathVariable String shortUrl){
        LinkRedirectionBean response = proxy.retrieveExchangeValue(shortUrl);
        return new LinkRedirectionBean(response.getLinkId(),response.getUserId(),shortUrl,response.getLongUrl(),
                response.getNumberOfClicks(),response.getPort());

    }

}
