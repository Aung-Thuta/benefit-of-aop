package com.demo;

import com.demo.ds.CurrencyType;
import com.demo.service.AlterCurrencyService;
import com.demo.service.CurrencyService;
import com.demo.service.MyCurrencyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
       AlterCurrencyService alterCurrencyService = context.getBean(AlterCurrencyService.class);

        MyCurrencyService myCurrencyService = context.getBean(MyCurrencyService.class);

        alterCurrencyService.changeCurrency(500,2.5);

        myCurrencyService.changeCurrency(200,1.2);
        myCurrencyService.changeCurrency(1000,2.6);
        myCurrencyService.currencyLongName(CurrencyType.US);
        myCurrencyService.currencyLongName(CurrencyType.EURO);
        myCurrencyService.currencyCountryName(CurrencyType.US);

        try{
            myCurrencyService.currencyCountryName(CurrencyType.EURO);

        }catch (IllegalArgumentException e){
            System.out.println("Exception caught!");
        }

    }
}
