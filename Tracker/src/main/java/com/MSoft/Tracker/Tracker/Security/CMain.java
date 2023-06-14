package com.MSoft.Tracker.Tracker.Security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CMain {
    @GetMapping(value = "/")
    public String signin(Model model){
        return "signinpage";
    }
    @PreAuthorize("isAuthenticated()")
    @GetMapping(value = "/profile")
    public String profile(Model model){
        return "profilepage";
    }
}
