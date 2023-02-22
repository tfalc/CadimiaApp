package com.tfalc.gymapp.controller;

import com.tfalc.gymapp.entity.Form.PhysicalAssessmentForm;
import com.tfalc.gymapp.entity.PhysicalAssessment;
import com.tfalc.gymapp.service.impl.PhysicalAssessmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assessment")
public class PhysicalAssessmentController {

    @Autowired
    private PhysicalAssessmentServiceImpl physicalAssessmentService;

    @PostMapping
    public PhysicalAssessment create(@RequestBody PhysicalAssessmentForm physicalAssessmentForm){
        return physicalAssessmentService.create(physicalAssessmentForm);
    }
}
