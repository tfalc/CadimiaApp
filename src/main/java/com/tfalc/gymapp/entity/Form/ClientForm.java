package com.tfalc.gymapp.entity.Form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientForm {
    @NotEmpty(message = "Field can't be empty.")
    @Size(min = 3, max =50, message = "'${validatedValue}' must be between {min} and {max} characters.")
    private String name;

    @NotEmpty(message = "Field can't be empty.")
    @CPF(message = "'${validatedValue}' is not valid!")
    private String cpf;

    @NotEmpty(message = "Field can't be empty.")
    @Size(min = 3, max =50, message = "'${validatedValue}' must be between {min} and {max} characters.")
    private String street;

    @NotNull(message = "Field can't be empty.")
    @Past(message = "Date '${validatedValue}' is invalid.")
    private LocalDate birthDate;
}
