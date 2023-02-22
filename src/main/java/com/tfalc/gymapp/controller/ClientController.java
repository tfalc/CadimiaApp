package com.tfalc.gymapp.controller;

import com.tfalc.gymapp.entity.ClientEntity;
import com.tfalc.gymapp.entity.Form.ClientForm;
import com.tfalc.gymapp.entity.PhysicalAssessment;
import com.tfalc.gymapp.service.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping
    public List<ClientEntity> getAll(){
        return clientService.getAll();
    }

    @PostMapping
    public ClientEntity createClient(@RequestBody ClientForm clientForm){
        return clientService.create(clientForm);
    }

    @GetMapping("/assessment/{id}")
    public List<PhysicalAssessment> getAllPhysicalAssessment(@PathVariable Long id){
        return clientService.getAllPhysicalAssessment(id);
    }
}
