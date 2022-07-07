package com.dufuna.berlin.TaofiqSulayman.tax.service;


import com.dufuna.berlin.TaofiqSulayman.tax.model.TaxEntity;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class TaxServiceImp implements TaxService {


    @Override
    public double taxCalculator(int income) {
        DecimalFormat formatter = new DecimalFormat("###,###,###.00");

        double taxOwedRange2 = (TaxEntity.TaxBracket2 - (TaxEntity.TaxBracket1 + 1)) * TaxEntity.Rate2;
        double taxOwedRange3 = taxOwedRange2 + (TaxEntity.TaxBracket3 - (TaxEntity.TaxBracket2 + 1)) * TaxEntity.Rate3;
        double taxOwedRange4 = taxOwedRange3 + (TaxEntity.TaxBracket4 - (TaxEntity.TaxBracket3 + 1)) * TaxEntity.Rate4;


        if (income <= TaxEntity.TaxBracket1){
            double currentTax = income * TaxEntity.Rate1;
            System.out.println("Your Tax bracket is $"+ TaxEntity.TaxBracket1 + " and tax is $" + formatter.format(currentTax));
            return currentTax;
        }else if (income <= TaxEntity.TaxBracket2){
            double currentTax = (income - TaxEntity.TaxBracket1) * TaxEntity.Rate2;
            double totalTax = taxOwedRange2 + currentTax;
            System.out.println("Your Tax bracket is $"+ TaxEntity.TaxBracket2 + " and outstanding tax is $" + formatter.format(taxOwedRange2) + ". Your total tax is $" + formatter.format(totalTax));
            return totalTax;
        }
        if (income > taxEntity.getTaxBracket2() && income <= taxEntity.getTaxBracket3()){
            double currentTax = (income - taxEntity.getTaxBracket2()) * taxEntity.getRate3();
            double totalTax = taxOwedRange3 + currentTax;
            System.out.println("Your Tax bracket is $"+ taxEntity.getTaxBracket3() + " and outstanding tax is $" + formatter.format(taxOwedRange3) + ". Your total tax is $" + formatter.format(totalTax));
            return totalTax;
        }
        if (income > taxEntity.getTaxBracket3() && income <= taxEntity.getTaxBracket4()){
            double currentTax = (income - taxEntity.getTaxBracket3()) * taxEntity.getRate4();
            double totalTax = taxOwedRange4 + currentTax;
            System.out.println("Your Tax bracket is $"+ taxEntity.getTaxBracket4() + " and outstanding tax is $" + formatter.format(taxOwedRange4) + ". Your total tax is $" + formatter.format(totalTax));
            return totalTax;
        }
        double taxOwedRange5 = (taxOwedRange4) + (income - (taxEntity.getTaxBracket4() + 1)) * taxEntity.getRate5();
        double currentTax = (income - taxEntity.getTaxBracket4()) * taxEntity.getRate5();
        double totalTax = taxOwedRange5 + currentTax;
        System.out.println("Your Tax bracket is $"+ taxEntity.getTaxBracket4() + " and above, your outstanding tax is $" + formatter.format(taxOwedRange5) + ". Your total tax is $" + formatter.format(totalTax));
        return totalTax;
    }
}



    public static void main(String[] args) {
        taxCalculator(180001);
        //SpringApplication.run(TaxService.class, args);
    }
}
