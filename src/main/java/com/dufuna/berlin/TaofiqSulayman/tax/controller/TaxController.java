package com.dufuna.berlin.TaofiqSulayman.tax.controller;


import com.dufuna.berlin.TaofiqSulayman.tax.dto.TaxRequest;
import com.dufuna.berlin.TaofiqSulayman.tax.service.TaxService;
import com.dufuna.berlin.TaofiqSulayman.tax.service.TaxServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tax")
public class TaxController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TaxRequest calculateTax(@RequestBody TaxRequest taxRequest){
        TaxService service = new TaxServiceImp();

        return TaxRequest.builder()
                .income(taxRequest.getIncome())
                .tax(service.taxCalculator(taxRequest.getIncome()))
                .build();
    }
}
