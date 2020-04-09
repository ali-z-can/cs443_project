package com.cs443.project.linkdeletionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@EnableAsync
@RestController
public class LinkDeletionController {

    @Autowired
    ReArrangementProxy proxy;

    @Autowired
    LinkRepository repository;

    @Async
    @Scheduled(fixedRate = 2 * 1000 )
    public void delete(){
        System.out.println("wololo");
        java.util.Date now = new java.util.Date();
        List<Link> links = repository.findAllByExpirationIsBefore(new java.sql.Date(now.getTime()));
        for(Link l : links){
            boolean b = proxy.rearrange(l.getUserId(),l.getNumberOfClicks());
            repository.deleteById(l.getId());
        }

    }
}
