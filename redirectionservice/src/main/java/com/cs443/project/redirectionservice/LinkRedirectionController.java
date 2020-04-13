package com.cs443.project.redirectionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkRedirectionController {

    @Autowired
    LinkRetrievalServiceProxy proxy;

    @Autowired
    IncremationProxy incProxy;

    @GetMapping("/{shortUrl}")
    public ResponseEntity<?> redirect(@PathVariable String shortUrl){
        LinkRedirectionBean response = proxy.retrieveExchangeValue(shortUrl);
        System.out.println("link id: " + response.getId());
        incProxy.increment(response.getId());

        HttpHeaders header = new HttpHeaders();
        header.add("Location",response.getLongUrl());
        return new ResponseEntity<>(header,HttpStatus.FOUND);

//        return new LinkRedirectionBean(response.getId(),response.getUserId(),shortUrl,response.getLongUrl(),
  //              response.getNumberOfClicks(),response.getPort());

    }

}
