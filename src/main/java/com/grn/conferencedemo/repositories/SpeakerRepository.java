package com.grn.conferencedemo.repositories;
import com.grn.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker,Long> {
}
