package com.cs443.project.userpastlinkanalyticsarrangementservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Optional;

@RestController
public class PastLinkRearrController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("/rearrangement/user/{userID}/numberOfClicks/{numberOfClicks}")
    public boolean rearrange(@PathVariable Long userID,@PathVariable int numberOfClicks){

        Optional<User> user = userRepository.findById(userID);
        user.get().setNumberOfClicks(user.get().getNumberOfClicks().add(new BigDecimal(numberOfClicks)));
        user.get().setNumberOfDistinctLinks(user.get().getNumberOfDistinctLinks().add(new BigDecimal(1)));
        userRepository.save(user.get());

        return true;
    }
}
