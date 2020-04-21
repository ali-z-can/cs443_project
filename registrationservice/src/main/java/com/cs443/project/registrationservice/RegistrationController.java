package com.cs443.project.registrationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class RegistrationController {

    @Autowired
    UserRepository repository;

    @CrossOrigin
    @PostMapping("/registration")
    public User register(@RequestBody RegistrationJSON registrationJSON){

        User existingUser = repository.findByUsername(registrationJSON.getUsername());

        if(existingUser == null){
            User newUser = new User(registrationJSON.getUsername(),registrationJSON.getPassword(),
                    new BigDecimal(0),new BigDecimal(0));
            repository.save(newUser);
            return newUser;
        }
        return null;
    }

}
