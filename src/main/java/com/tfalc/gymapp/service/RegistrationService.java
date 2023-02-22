package com.tfalc.gymapp.service;

import com.tfalc.gymapp.entity.Form.RegistrationForm;
import com.tfalc.gymapp.entity.Registration;

import java.util.List;

public interface RegistrationService {

    /**
     * Create a new registration
     * @param form - form to register a new client's registration
     * @return - Created registration.
     */
    Registration create(RegistrationForm form);

    /**
     * Returns a registration from database by its id
     * @param id - registration identifier
     * @return - Registration according to its id
     */
    Registration get(Long id);

    /**
     * Returns all registration in database
     * @return - a list of registration
     */
    List<Registration> getAll(String bairro);

    /**
     * Delete a specific registration
     * @param id - registration identifier
     */
    void delete(Long id);
}
