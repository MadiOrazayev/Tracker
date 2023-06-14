package com.MSoft.Tracker.Tracker.Records;

import com.MSoft.Tracker.Tracker.Security.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name="records")
public class MRecords extends BaseEntity {
    private String username;
    private String costname;
    private int cost;
    private LocalDate date;
}
