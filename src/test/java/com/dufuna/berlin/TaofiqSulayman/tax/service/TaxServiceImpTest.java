package com.dufuna.berlin.TaofiqSulayman.tax.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxServiceImpTest {

    private final TaxService service = new TaxServiceImp();
    @Test
    void taxBelowBracket1EqualZero() {
        double expectedTax = 0.00;
        assertEquals(expectedTax,service.taxCalculator(17900) );
    }

    @Test
    void calculateTaxAboveBracket2() {
        int income = 39000;

        double expectedTax = 21446.485;
        assertEquals(expectedTax,service.taxCalculator(income));

    }

    @Test
    void calculateTaxAboveBracket3() {

        double expectedTax = 57796.115;

        assertEquals(expectedTax,service.taxCalculator(100000));
    }

    @Test
    void calculateTaxAboveBracket4() {

        double expectedTax = 58595.665;

        assertEquals(expectedTax,service.taxCalculator(185000));
    }


}