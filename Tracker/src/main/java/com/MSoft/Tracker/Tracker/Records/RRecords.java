package com.MSoft.Tracker.Tracker.Records;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
public interface RRecords extends JpaRepository<MRecords,Long> {
    List<MRecords> findByUsernameAndDate(String username, LocalDate date);
    List<MRecords> findByUsername(String username);
}
