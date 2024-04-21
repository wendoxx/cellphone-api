package com.example.cellphoneapi.feign;

import com.example.cellphoneapi.domain.CellPhone;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name = "cellphoneapi", url = "https://cellphoneapi.s3.sa-east-1.amazonaws.com")
public interface CellPhoneClient {
    @GetMapping ("/cellphones.JSON")
    List<CellPhone> getCellphones();
}
