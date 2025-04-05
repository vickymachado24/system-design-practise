package com.machado.lld.observerpattern.oberserver;

import com.machado.lld.observerpattern.observable.ObservableInterface;

import java.util.Objects;

public class SmsObserver implements ObserverInterface{
    ObservableInterface observable;
    String phoneNumber;

    public SmsObserver(String phoneNumber, ObservableInterface observableInterface){
        this.observable = observableInterface;
        this.phoneNumber = phoneNumber;
        if(Objects.nonNull(observableInterface))  observable.register(this);
    }
    @Override
    public void update() {
        System.out.println("Sending message to " + phoneNumber + " that the data is increased from 0 to " + this.observable.getData());
    }
}
