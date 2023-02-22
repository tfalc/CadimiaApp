package com.tfalc.gymapp.service;

import com.tfalc.gymapp.entity.ClientEntity;
import com.tfalc.gymapp.entity.Form.ClientForm;
import com.tfalc.gymapp.entity.Form.ClientUpdateForm;
import com.tfalc.gymapp.entity.PhysicalAssessment;

import java.util.List;

public interface ClientService {
    /**
     * Create a client and save into database.
     * @param form related to the data to create a new client
     * @return Client created.
     */
    ClientEntity create(ClientForm form);

    /**
     * Returns one client by its id
     * @param id client's id
     * @return Client according to id.
     */
    ClientEntity get(Long id);

    /**
     * Returns all clients in the database
     * @return Uma lista os Alunos que estão salvas no DB.
     */

    List<ClientEntity> getAll(String birthDate);

    /**
     * Update client
     * @param id client's id
     * @param formUpdate form used to update client's data
     * @return Recently updated client.
     */
    ClientEntity update(Long id, ClientUpdateForm formUpdate);

    /**
     * Deletes a specified client.
     * @param id client's id to remove from database.
     */
    void delete(Long id);

    /**
     *
     * @param id client's id to recover it's assessments
     * @return a list with all client's assessments
     */
    List<PhysicalAssessment> getAllPhysicalAssessment(Long id);

}
