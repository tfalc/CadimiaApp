package com.tfalc.gymapp.repository;

import com.tfalc.gymapp.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
