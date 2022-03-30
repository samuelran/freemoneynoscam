package com.example.freemoneynoscam.services;

import com.example.freemoneynoscam.Models.email;
import com.example.freemoneynoscam.Repository.emailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class emailService {

    @Autowired
    emailRepo _emailRepo;

    public List<email> fetchAll(){
        return _emailRepo.fetchAll();
    }
    public email addEmail(email userEmail){
        return _emailRepo.addEmail(userEmail);

    }
}
