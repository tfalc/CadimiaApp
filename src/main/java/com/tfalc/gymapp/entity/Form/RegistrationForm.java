package com.tfalc.gymapp.entity.Form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationForm {
    @NotNull(message = "Field can't be null'")
    @Positive(message = "The ID must be positive")
    private Long clientId;
}
