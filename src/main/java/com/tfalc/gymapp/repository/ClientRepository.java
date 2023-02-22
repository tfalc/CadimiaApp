package com.tfalc.gymapp.repository;

import com.tfalc.gymapp.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

    /**
     *
     * @param birthData
     * @return
     */
    List<ClientEntity> findByBirthDate(LocalDate birthData);
}
