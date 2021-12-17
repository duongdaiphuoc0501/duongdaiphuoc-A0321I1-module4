package com.example.muon_sach.service;



import com.example.muon_sach.model.Status;
import com.example.muon_sach.repository.IStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService implements IStatusService{

    @Autowired
    IStatusRepository statusRepository;


    @Override
    public void createStatus() {
        statusRepository.save(new Status(1, "available"));
        statusRepository.save(new Status(2, "used"));
    }
}
