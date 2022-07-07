package com.dufuna.berlin.TaofiqSulayman.tax.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TaxEntity {

    public static final int TaxBracket1 = 18200;
    public static final int TaxBracket2 = 37000;
    public static final int TaxBracket3 = 90000;
    public static final int TaxBracket4 = 180000;


    public static final double Rate1 = 0.00;
    public static final double Rate2 = 0.19;
    public static final double Rate3 = 0.325;
    public static final double Rate4 = 0.37;
    public static final double Rate5 = 0.45;


}
