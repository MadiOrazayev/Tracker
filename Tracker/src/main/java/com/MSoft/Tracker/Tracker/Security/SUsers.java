package com.MSoft.Tracker.Tracker.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class SUsers implements UserDetailsService {
    @Autowired
    private RUsers Rusers;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MUsers users=Rusers.findByUsername(username);
        if(users==null) throw new UsernameNotFoundException("User not found!");
        return users;
    }
}
