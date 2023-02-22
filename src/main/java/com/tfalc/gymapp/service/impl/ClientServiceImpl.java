package com.tfalc.gymapp.service.impl;

import com.tfalc.gymapp.entity.ClientEntity;
import com.tfalc.gymapp.entity.Form.ClientForm;
import com.tfalc.gymapp.entity.Form.ClientUpdateForm;
import com.tfalc.gymapp.entity.PhysicalAssessment;
import com.tfalc.gymapp.repository.ClientRepository;
import com.tfalc.gymapp.repository.PhysicalAssessmentRepository;
import com.tfalc.gymapp.service.ClientService;
import com.tfalc.gymapp.utils.JavaTimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private PhysicalAssessmentRepository physicalAssessmentRepository;

    @Override
    public ClientEntity create(ClientForm clientForm){
        ClientEntity client = new ClientEntity();
        client.setName(clientForm.getName());
        client.setStreet(clientForm.getStreet());
        client.setCpf(clientForm.getCpf());
        client.setBirthDate(clientForm.getBirthDate());

        return clientRepository.save(client);
    }

    @Override
    public ClientEntity get(Long id){
        return null;
    }

    @Override
    public List<ClientEntity> getAll(String birthDate) {
        if(birthDate == null) {
            return clientRepository.findAll();
        } else{
            LocalDate localDate = LocalDate.parse(birthDate, JavaTimeUtil.LOCAL_DATE_FORMATTER);
            return clientRepository.findByBirthDate(localDate);
        }
    }

    @Override
    public ClientEntity update(Long id, ClientUpdateForm clientUpdateForm){
        return null;
    }

    @Override
    public void delete(Long id){

    }

    @Override
    public List<PhysicalAssessment> getAllPhysicalAssessment(Long id) {
        ClientEntity client = clientRepository.findById(id).get();

        return client.getPhysicalAssessmentList();
    }
}
