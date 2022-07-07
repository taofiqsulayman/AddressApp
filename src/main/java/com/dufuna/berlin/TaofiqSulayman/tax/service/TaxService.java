package com.dufuna.berlin.TaofiqSulayman.tax.service;

public interface TaxService {

    /**
     * @param income of the user is the accepted parameter taken by taxCalculator
     *
     */
        double taxCalculator(int income);
    }
