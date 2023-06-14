package com.MSoft.Tracker.Tracker.Records.Monthly;

import com.MSoft.Tracker.Tracker.Records.DTORecords;
import com.MSoft.Tracker.Tracker.Records.SGetRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/getmonth")
public class RCGetMonth {
    @Autowired
    SGetMonth Sgetmonth;
    @PreAuthorize("isAuthenticated()")
    @PostMapping
    public DTOMonth getMonth(@RequestBody DTORecords record){
        return Sgetmonth.getMonth(record);
    }
}
