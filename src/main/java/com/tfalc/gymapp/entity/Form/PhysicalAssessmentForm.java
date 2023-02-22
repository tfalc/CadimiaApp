package com.tfalc.gymapp.entity.Form;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalAssessmentForm {
    @Positive(message = "ID must be higher than 1.")
    private Long clientId;

    @NotNull(message = "Field can't be empty.")
    @Positive(message = "${validatedValue}' must be higher than 1.")
    private double weight;

    @NotNull(message = "Field can't be empty.")
    @Positive(message = "${validatedValue}' must be higher than 1.")
    @DecimalMin(value = "150", message = "'${validatedValue}' must be at the minimum {value}.")
    private double height;
}
