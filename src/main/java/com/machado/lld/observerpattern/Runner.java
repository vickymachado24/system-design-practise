package com.machado.lld.observerpattern;

import com.machado.lld.observerpattern.oberserver.EmailObserver;
import com.machado.lld.observerpattern.oberserver.ObserverInterface;
import com.machado.lld.observerpattern.oberserver.SmsObserver;
import com.machado.lld.observerpattern.observable.ObservableInterface;
import com.machado.lld.observerpattern.observable.StockObservable;

public class Runner {

    public static void main(String[] args) {
        /***
         * observable which will keep the track of its own data and send notifications based on
         * data change (depending upon business logic)
         */
        StockObservable stockObservable = new StockObservable();

        /***
         * constructor automatically register, not good but just for the sake of demo
         */
        ObserverInterface emailObserver = new EmailObserver("something@email.com", stockObservable);
        ObserverInterface smsObserver = new SmsObserver("987654321", stockObservable);

        /**
         * from 0 to 50, as per business logic the change is triggered and notify will be called
         */
        stockObservable.setData(50);
        stockObservable.setData(0);
        stockObservable.setData(40);
    }
}
