package com.example.cellphoneapi.controllers;

import com.example.cellphoneapi.domain.CellPhone;
import com.example.cellphoneapi.services.CellPhoneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cellphones")
public class CellPhoneController {

    private final CellPhoneService service;

    public CellPhoneController(CellPhoneService service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<List<CellPhone>> getCellPhones() {
        List<CellPhone> cellPhones = this.service.getCellPhones();
        System.out.println(cellPhones);
        return ResponseEntity.ok().body(cellPhones);
        
    }
}
