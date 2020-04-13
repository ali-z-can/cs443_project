package com.cs443.project.userpastlinkanalyticsretrievalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserPastStatsController {

    @Autowired
    UserRepository repository;

    @GetMapping("/user/{userid}/get-past-analytics")
    public StatsOnly retrieveOldStats(@PathVariable Long userid){

       // Collection<StatsOnly> toRet = repository.findByUserId(userid);

        return repository.findByUserId(userid).iterator().next();
    }

}
