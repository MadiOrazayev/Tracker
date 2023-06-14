package com.MSoft.Tracker.Tracker.Security;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface RUsers extends JpaRepository<MUsers,Long> {
    MUsers findByUsername(String username);
}
