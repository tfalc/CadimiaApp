package com.tfalc.gymapp.entity.Form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientUpdateForm {
    private String name;

    private String street;

    private LocalDate birthDate;
}
