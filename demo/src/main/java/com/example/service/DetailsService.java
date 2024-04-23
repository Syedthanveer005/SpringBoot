package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.DetailsRepository;

@Service
public class DetailsService {

    private final DetailsRepository detailsRepository;

    @Autowired
    public DetailsService(DetailsRepository detailsRepository) {
        this.detailsRepository = detailsRepository;
    }

    public List<Object[]> getSpecificColumns() {
        return detailsRepository.findSpecificColumns();
    }
}
