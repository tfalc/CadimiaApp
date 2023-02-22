package com.tfalc.gymapp.service;

import com.tfalc.gymapp.entity.Form.PhysicalAssessmentForm;
import com.tfalc.gymapp.entity.Form.PhysicalAssessmentUpdateForm;
import com.tfalc.gymapp.entity.PhysicalAssessment;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PhysicalAssessmentService {
    /**
     * Create a physical assessment and save it to the database
     * @param form - refers to the data to be saved
     * @return - The saved assessment.
     */
    PhysicalAssessment create(PhysicalAssessmentForm form);

    /**
     * Returns a pyhysical assessment found in the database by its id
     * @param id - Physical Assessment id
     * @return - Physical assessment according to id
     */
    PhysicalAssessment get(Long id);

    /**
     * Returns all physical assessment in the database
     * @return - A list of all Physical assesment saved in the database
     */
    List<PhysicalAssessment> getAll();

    /**
     * Updates a physical assessment
     * @param id - Physical Assessment id
     * @param formUpdate - Form to update the assessment
     * @return - The updated Physical assessment
     */
    PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm formUpdate);

    /**
     * Delete a physical assessment by its id
     * @param id - Physical assessment id
     */
    void delete(Long id);
}
