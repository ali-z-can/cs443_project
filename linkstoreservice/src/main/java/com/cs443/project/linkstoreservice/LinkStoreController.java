package com.cs443.project.linkstoreservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class LinkStoreController {

    @Autowired
    Environment environment;

    @Autowired
    LinkRepository repository;

    @PostMapping("/user/{userId}/link-storage")
    public Link store(@PathVariable Long userId,@RequestBody myJSON myJSON) throws Exception {



        Link l1 = repository.findByShortUrl(myJSON.getShortUrl());
        Link l2 = repository.findByLongUrl(myJSON.getLongUrl());


        if(l1 == null && l2 == null){
            java.util.Date now = new java.util.Date();

            Calendar c = Calendar.getInstance();
            c.setTime(now);
            c.add(Calendar.DATE, myJSON.getDaysToBeAllive());
            now = c.getTime();
            java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(now.getTime());

            Link l3 = new Link(userId,myJSON.getShortUrl(),myJSON.getLongUrl(),0,0,sqlTimestamp);

            System.out.println(l3);

            repository.save(l3);
            return l3;
        }
        //todo throw meaningful exception
        else throw new Exception("url exist");

    }
}
