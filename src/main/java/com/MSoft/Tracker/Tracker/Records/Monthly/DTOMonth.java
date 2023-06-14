package com.MSoft.Tracker.Tracker.Records.Monthly;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class DTOMonth {
    int[][] cost;
    String[][] day;
}
