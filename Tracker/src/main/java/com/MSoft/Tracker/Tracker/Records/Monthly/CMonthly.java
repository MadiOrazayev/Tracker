package com.MSoft.Tracker.Tracker.Records.Monthly;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CMonthly {
    @PreAuthorize("isAuthenticated()")
    @GetMapping(value = "/calendarview")
    public String calendarview(Model model){
        return "calendarview";
    }
}
