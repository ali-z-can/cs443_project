package com.cs443.project.linkstoreservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinkStoreController {

    @Autowired
    Environment environment;

    @Autowired
    LinkRepository repository;

    @PostMapping("/user/{userId}/link-storage/shortUrl/{shortUrl}/longUrl/{longUrl}")
    public Link store(@PathVariable Long userId,@PathVariable String shortUrl, @PathVariable String longUrl) throws Exception {
        Link l1 = repository.findByShortUrl(shortUrl);
        Link l2 = repository.findByLongUrl(longUrl);
        if(l1 == null && l2 == null){
            Link l3 = new Link(userId,shortUrl,longUrl,0);
            repository.save(l3);
            return l3;
        }
        //todo throw meaningful exception
        else throw new Exception("url exist");

    }
}
