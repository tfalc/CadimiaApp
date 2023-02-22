package com.tfalc.gymapp.entity.Form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalAssessmentUpdateForm {
    private double weight;
    private double height;
}
