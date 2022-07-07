package com.dufuna.berlin.TaofiqSulayman.tax;


import com.dufuna.berlin.TaofiqSulayman.tax.service.TaxService;
import com.dufuna.berlin.TaofiqSulayman.tax.service.TaxServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaxCalculatorApp {
    public static void main(String[] args) {
        TaxService taxService = new TaxServiceImp();
        taxService.taxCalculator(17900);
        taxService.taxCalculator(39000);
        taxService.taxCalculator(100000);
        taxService.taxCalculator(185000);
        SpringApplication.run(TaxCalculatorApp.class, args);
    }
}
