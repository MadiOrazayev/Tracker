package com.MSoft.Tracker.Tracker.Records;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SDelRecord {
    @Autowired
    RRecords Rrecords;
    public String delRecord(Long id){
        Optional<MRecords> record=Rrecords.findById(id);
        if(record==null){
            return "not found";
        }else{
            Rrecords.deleteById(id);
            return "deleted";
        }
    }
}
