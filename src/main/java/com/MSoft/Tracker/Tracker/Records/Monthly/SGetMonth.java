package com.MSoft.Tracker.Tracker.Records.Monthly;

import com.MSoft.Tracker.Tracker.Records.DTORecords;
import com.MSoft.Tracker.Tracker.Records.MRecords;
import com.MSoft.Tracker.Tracker.Records.RRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.List;

@Service
public class SGetMonth {
    @Autowired
    RRecords Rrecords;
    public DTOMonth getMonth(DTORecords record){
        List<MRecords> records=Rrecords.findByUsername(record.getUsername());
        DTOMonth DTOmonth=new DTOMonth();
        DTOmonth.cost=new int[5][8];
        DTOmonth.day=new String[5][8];
        for(int i=0; i<5;i++){
            for(int j=0;j<8;j++){
                DTOmonth.cost[i][j]=0;
            }
        }
        for(MRecords Mrecord:records){
            if(record.getDate().getMonthValue()==Mrecord.getDate().getMonthValue()){
                WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY, 1);
                TemporalField weekOfMonth = weekFields.weekOfMonth();
                if(DTOmonth.cost[Mrecord.getDate().get(weekOfMonth)-1][Mrecord.getDate().getDayOfWeek().getValue()-1]==0){
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
                    DTOmonth.day[Mrecord.getDate().get(weekOfMonth)-1][Mrecord.getDate().getDayOfWeek().getValue()-1] = Mrecord.getDate().format(formatter);
                }
                DTOmonth.cost[Mrecord.getDate().get(weekOfMonth)-1][Mrecord.getDate().getDayOfWeek().getValue()-1]+=Mrecord.getCost();
                DTOmonth.cost[Mrecord.getDate().get(weekOfMonth)-1][7]+=Mrecord.getCost();
            }
        }
        return DTOmonth;
    }
}
