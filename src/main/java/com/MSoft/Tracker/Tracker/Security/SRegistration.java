package com.MSoft.Tracker.Tracker.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SRegistration {
    @Autowired
    private RUsers Rusers;

    @Autowired
    PasswordEncoder passwordEncoder;

    public String register(DTORegistration DTOregistration){
        MUsers user=Rusers.findByUsername(DTOregistration.getUsername());
        if(user==null){
            user=new MUsers();
            user.setUsername(DTOregistration.getUsername());
            user.setPassword(passwordEncoder.encode(DTOregistration.getPassword()));
            Rusers.save(user);
            return "Registered, you can enter now";
        }
        return "User exists";
    }
}
