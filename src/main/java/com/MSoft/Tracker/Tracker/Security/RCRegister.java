package com.MSoft.Tracker.Tracker.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/register")
public class RCRegister {
    @Autowired
    SRegistration Sregistration;
    @PostMapping
    public String register(@RequestBody DTORegistration DTOregistration){
        return Sregistration.register(DTOregistration);
    }
}
