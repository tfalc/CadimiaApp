package com.tfalc.gymapp.entity.Form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalAssessmentForm {
    //@Positive(message = "O Id do aluno precisa ser positivo.")
    private Long clientId;

    //@NotNull(message = "Preencha o campo corretamente.")
    //@Positive(message = "${validatedValue}' precisa ser positivo.")
    private double weight;

    //@NotNull(message = "Preencha o campo corretamente.")
    //@Positive(message = "${validatedValue}' precisa ser positivo.")
    //@DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")
    private double height;
}
