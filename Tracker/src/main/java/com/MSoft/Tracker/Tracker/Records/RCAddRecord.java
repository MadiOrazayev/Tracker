package com.MSoft.Tracker.Tracker.Records;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/addrecord")
public class RCAddRecord {
    @Autowired
    SAddRecord Saddrecord;
    @PreAuthorize("isAuthenticated()")
    @PostMapping
    public String getRecords(@RequestBody DTORecords record){
        return Saddrecord.addRecord(record);
    }
}
