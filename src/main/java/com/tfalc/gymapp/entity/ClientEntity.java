package com.tfalc.gymapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_client")
@JsonIgnoreProperties({"hibernate.LazyInitializer", "handler"})
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    @CPF
    private String cpf;

    private String street;

    private LocalDate birthDate;

    @OneToMany(mappedBy = "clientEntity", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<PhysicalAssessment> physicalAssessmentList = new ArrayList<>();
}
