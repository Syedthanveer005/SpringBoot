package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.DetailsService;

@RestController
@RequestMapping("/details")
public class DetailsController {

    private final DetailsService detailsService;

    @Autowired
    public DetailsController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }

    @GetMapping("/specific-columns")
    public List<Object[]> getSpecificColumns() {
        return detailsService.getSpecificColumns();
    }
}
