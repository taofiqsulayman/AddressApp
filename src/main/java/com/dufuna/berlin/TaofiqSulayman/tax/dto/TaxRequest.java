package com.dufuna.berlin.TaofiqSulayman.tax.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor



public class TaxRequest {
    private int income;
    private double tax;
}