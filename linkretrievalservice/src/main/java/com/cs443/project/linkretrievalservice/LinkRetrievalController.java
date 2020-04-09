package com.cs443.project.linkretrievalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/links-retrieval/user/{id}")
    public List<Link> retrieveByUserId(@PathVariable Long id){
        List<Link> links = repository.findAllByUserId(id);
        return links;
    }
}
