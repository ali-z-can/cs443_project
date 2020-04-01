package com.cs443.project.linkretrievalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkRetrievalController {

    @Autowired
    Environment environment;

    @Autowired
    LinkRepository repository;

    @GetMapping("/link-retrieval/{shortUrl}")
    public Link retrieve(@PathVariable String shortUrl){
        Link link = repository.findByShortUrl(shortUrl);
        link.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return link;
    }
}
