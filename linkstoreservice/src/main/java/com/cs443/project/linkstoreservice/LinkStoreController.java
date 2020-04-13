package com.cs443.project.linkstoreservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class LinkStoreController {

    @Autowired
    Environment environment;

    @Autowired
    LinkRepository repository;

    @PostMapping("/user/{userId}/link-storage/shortUrl/{shortUrl}/longUrl/{longUrl}/daystobealive/{daystobealive}")
    public Link store(@PathVariable Long userId,@PathVariable String shortUrl, @PathVariable String longUrl,@PathVariable int daystobealive) throws Exception {
        Link l1 = repository.findByShortUrl(shortUrl);
        Link l2 = repository.findByLongUrl(longUrl);

        if(l1 == null && l2 == null){
            java.util.Date now = new java.util.Date();

            Calendar c = Calendar.getInstance();
            c.setTime(now);
            c.add(Calendar.DATE, daystobealive);
            now = c.getTime();
            java.sql.Date sqlDate = new java.sql.Date(now.getTime());

            Link l3 = new Link(userId,shortUrl,longUrl,0,0,sqlDate);
            repository.save(l3);
            return l3;
        }
        //todo throw meaningful exception
        else throw new Exception("url exist");

    }
}
