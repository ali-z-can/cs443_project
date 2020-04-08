package com.cs443.project.authenticationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.BeanIds;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtConfig jwtConfig;

    @PostMapping("/authxxx")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{

        System.out.println(authenticationRequest);
        System.out.println(authenticationRequest.getUsername());
        System.out.println(authenticationRequest.getPassword());

        try {

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword()));
        }catch (BadCredentialsException e){
            //todo better exception
            throw new Exception("Incorrect username password",e);
        }
        System.out.println(userDetailsService==null);
        final User usr = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        final String jwt = jwtConfig.generateToken(usr);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }


}
