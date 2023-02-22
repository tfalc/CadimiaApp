package com.tfalc.gymapp.service.impl;

import com.tfalc.gymapp.entity.ClientEntity;
import com.tfalc.gymapp.entity.Form.PhysicalAssessmentForm;
import com.tfalc.gymapp.entity.Form.PhysicalAssessmentUpdateForm;
import com.tfalc.gymapp.entity.PhysicalAssessment;
import com.tfalc.gymapp.repository.ClientRepository;
import com.tfalc.gymapp.repository.PhysicalAssessmentRepository;
import com.tfalc.gymapp.service.PhysicalAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalAssessmentServiceImpl implements PhysicalAssessmentService {

    @Autowired
    private PhysicalAssessmentRepository physicalAssessmentRepository;

    @Autowired
    private ClientRepository clientRepository;

    public PhysicalAssessment create(PhysicalAssessmentForm physicalAssessmentForm){
        PhysicalAssessment physical = new PhysicalAssessment();
        ClientEntity client = clientRepository.findById(physicalAssessmentForm.getClientId()).get();

        physical.setId(client.getId());
        physical.setWeight(physicalAssessmentForm.getWeight());
        physical.setHeight(physicalAssessmentForm.getHeight());

        return physicalAssessmentRepository.save(physical);
    }

    public PhysicalAssessment get(Long id){
        return null;
    }

    public List<PhysicalAssessment> getAll(){
        return null;
    }

    @Override
    public PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
