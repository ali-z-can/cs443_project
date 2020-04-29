package com.cs443.project.userpastlinkanalyticsretrievalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserPastStatsController {

    @Autowired
    UserRepository repository;

    @CrossOrigin
    @GetMapping("/user/{userid}/get-past-analytics")
    public StatsOnly retrieveOldStats(@PathVariable Long userid){

       // Collection<StatsOnly> toRet = repository.findByUserId(userid);

        return repository.findByUserId(userid).iterator().next();
    }

    @CrossOrigin
    @GetMapping("/admin/getUserStats")
    public ToSend getUserStats(){
        ToSend toSend = new ToSend();
        toSend.setClicks( repository.clicks() );
        toSend.setLinks( repository.links() );
        toSend.setNumberOfUser( repository.countByUserIdGreaterThan(1) );
        return toSend;


    }

}
