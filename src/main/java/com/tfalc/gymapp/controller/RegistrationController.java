package com.tfalc.gymapp.controller;

import com.tfalc.gymapp.entity.Form.RegistrationForm;
import com.tfalc.gymapp.entity.Registration;
import com.tfalc.gymapp.service.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping
    public Registration create(@Valid @RequestBody RegistrationForm registration) {
        return registrationService.create(registration);
    }

    @GetMapping
    public List<Registration> getAll() {
        return registrationService.getAll();
    }
}
