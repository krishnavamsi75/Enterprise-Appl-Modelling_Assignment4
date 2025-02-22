package com.Vamsi.Assig4.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vamsi.Assig4.Models.WorkshopRegModel;
import com.Vamsi.Assig4.Repository.WorkshopRegRepository;

@Service  
public class WorkshopRegService {

    @Autowired
    private WorkshopRegRepository registrationRepository;

    public WorkshopRegModel saveRegistration(WorkshopRegModel request) {  
        return registrationRepository.save(request);
    }
}
