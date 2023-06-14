package com.MSoft.Tracker.Tracker.Records;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class SGetRecords {
    @Autowired
    RRecords Rrecords;
    public List<DTORecords> getRecords(DTORecords record){
        List<MRecords> records=Rrecords.findByUsernameAndDate(record.username, record.date);
        List<DTORecords> DTOrecords=new ArrayList<>();
        for(MRecords Mrecord:records){
            DTORecords DTOrecord=new DTORecords();
            DTOrecord.setDate(Mrecord.getDate());
            DTOrecord.setCostname(Mrecord.getCostname());
            DTOrecord.setCost(Mrecord.getCost());
            DTOrecords.add(DTOrecord);
        }
        return DTOrecords;
    }
}
