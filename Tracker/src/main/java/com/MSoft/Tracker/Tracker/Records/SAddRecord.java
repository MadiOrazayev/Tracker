package com.MSoft.Tracker.Tracker.Records;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SAddRecord {
    @Autowired
    RRecords Rrecords;
    public String addRecord(DTORecords record){
        MRecords Mrecord=new MRecords();
        Mrecord.setDate(record.date);
        Mrecord.setCostname(record.costname);
        Mrecord.setCost(record.cost);
        Mrecord.setUsername(record.username);
        Rrecords.save(Mrecord);
        return "saved";
    }
}
