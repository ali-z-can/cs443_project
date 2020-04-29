package com.cs443.project.linkanalyticsservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LinkAnalyticsController {

    @Autowired
    LinkRepository repository;

    @CrossOrigin
    @GetMapping("link-click-increment/link/{linkId}")
    public Link increment(@PathVariable Long linkId){

        Optional<Link> link = repository.findById(linkId);
        link.get().setNumberOfClicks(link.get().getNumberOfClicks()+1);
        repository.save(link.get());
        return link.get();
    }
}
