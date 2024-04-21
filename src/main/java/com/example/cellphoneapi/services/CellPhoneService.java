package com.example.cellphoneapi.services;
import com.example.cellphoneapi.domain.CellPhone;
import com.example.cellphoneapi.feign.CellPhoneClient;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CellPhoneService {

    private final CellPhoneClient cellPhoneClient;

    public CellPhoneService(CellPhoneClient client) {
        this.cellPhoneClient = client;
    }

    public List<CellPhone> getCellPhones() {
        return this.cellPhoneClient.getCellphones();
    }
}
