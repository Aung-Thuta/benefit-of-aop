package com.demo.service;

import com.demo.annotation.InTransaction;
import com.demo.annotation.Secured;
import com.demo.ds.CurrencyType;
import org.springframework.stereotype.Component;

@Component @Secured

public class MyCurrencyService {
    @InTransaction


    public void changeCurrency(int num, double rate){

    }

    public void changeCurrency(){

    }

    public void currencyLongName(CurrencyType currencyType){

    }

    public String currencyCountryName(CurrencyType currencyType){
        if (currencyType.equals(CurrencyType.US)){
            return "US";
        }
        throw new IllegalArgumentException("Error!");
    }
}
