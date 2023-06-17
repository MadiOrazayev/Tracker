package com.MSoft.Tracker.Tracker.Records;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/delrecord")
public class RCDelRecord {
    @Autowired
    SDelRecord Sdelrecord;
    @PreAuthorize("isAuthenticated()")
    @PostMapping
    public String delRecord(@RequestBody Long id){
        return Sdelrecord.delRecord(id);
    }
}
