package com.tfalc.gymapp.repository;

import com.tfalc.gymapp.entity.PhysicalAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalAssessmentRepository extends JpaRepository<PhysicalAssessment, Long> {
}
