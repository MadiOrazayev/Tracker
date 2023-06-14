package com.MSoft.Tracker.Tracker.Records;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class DTORecords {
    String username;
    String costname;
    int cost;
    LocalDate date;
}
