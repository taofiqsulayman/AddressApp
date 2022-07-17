package com.dufuna.berlin.TaofiqSulayman.tax.service;


import com.dufuna.berlin.TaofiqSulayman.tax.model.TaxEntity;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
/**
    * This is an implementation of the tax Service interface
 **/
@Service
public class TaxServiceImp implements TaxService {


    @Override
    public double taxCalculator(int income) {
        /*
         * Decimal formatter helps to format the result in the appropriate way using commas and decimals
         */


//        DecimalFormat formatter = new DecimalFormat("###,###,###.00");


        /*
         * the tax owed before entering each tax bracket is calculated, so it can be easily added to current tax
         */
        double taxOwedRange2 = (TaxEntity.TaxBracket2 - (TaxEntity.TaxBracket1 + 1)) * TaxEntity.Rate2;
        double taxOwedRange3 = taxOwedRange2 + (TaxEntity.TaxBracket3 - (TaxEntity.TaxBracket2 + 1)) * TaxEntity.Rate3;
        double taxOwedRange4 = taxOwedRange3 + (TaxEntity.TaxBracket4 - (TaxEntity.TaxBracket3 + 1)) * TaxEntity.Rate4;


        /*
         * Now the supplied income is passed through different tax brackets to see what category it falls and also do the appropriate calculations
         */

       if (income <= TaxEntity.TaxBracket1){
            double currentTax = income * TaxEntity.Rate1;
            System.out.println("Your Tax bracket is $"+ TaxEntity.TaxBracket1 + " and tax is $" + currentTax);
            return currentTax;
        }else if (income <= TaxEntity.TaxBracket2){
            double currentTax = taxOwedRange2 + (income - TaxEntity.TaxBracket1) * TaxEntity.Rate2;

            System.out.println("Your Tax bracket is $"+ TaxEntity.TaxBracket2 + " and outstanding tax is $" + taxOwedRange2 + ". Your total tax is $" + currentTax);

            return currentTax;
        }else if (income <= TaxEntity.TaxBracket3){
            double currentTax = (income - TaxEntity.TaxBracket2) * TaxEntity.Rate3;
            double totalTax = taxOwedRange3 + currentTax;

            System.out.println("Your Tax bracket is $"+ TaxEntity.TaxBracket3 + " and outstanding tax is $" + taxOwedRange3 + ". Your total tax is $" + totalTax);
            return totalTax;
        } else if (income <= TaxEntity.TaxBracket4){
            double currentTax = (income - TaxEntity.TaxBracket3) * TaxEntity.Rate4;
            double totalTax = taxOwedRange4 + currentTax;

            System.out.println("Your Tax bracket is $"+ TaxEntity.TaxBracket4 + " and outstanding tax is $" + taxOwedRange4 + ". Your total tax is $" + totalTax);

            return totalTax;
        }
        double taxOwedRange5 = (taxOwedRange4) + (income - (TaxEntity.TaxBracket4 + 1)) * TaxEntity.Rate5;
        double currentTax = (income - TaxEntity.TaxBracket4) * TaxEntity.Rate5;
        double totalTax = taxOwedRange5 + currentTax;
        System.out.println("Your Tax bracket is $"+ TaxEntity.TaxBracket4 + " and above, your outstanding tax is $" + taxOwedRange5 + ". Your total tax is $" + totalTax);

        return totalTax;
    }
}


