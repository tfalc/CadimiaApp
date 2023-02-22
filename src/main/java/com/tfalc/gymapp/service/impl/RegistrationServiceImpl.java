package com.tfalc.gymapp.service.impl;

import com.tfalc.gymapp.entity.ClientEntity;
import com.tfalc.gymapp.entity.Form.RegistrationForm;
import com.tfalc.gymapp.entity.Registration;
import com.tfalc.gymapp.repository.ClientRepository;
import com.tfalc.gymapp.repository.RegistrationRepository;
import com.tfalc.gymapp.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Registration create(RegistrationForm registrationForm) {
        Registration registration = new Registration();
        ClientEntity client = clientRepository.findById(registration.getClient().getId()).get();

        registration.setClient(client);

        return registrationRepository.save(registration);
    }

    @Override
    public Registration get(Long id) {
        return registrationRepository.findById(id).get();
    }

    @Override
    public List<Registration> getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
