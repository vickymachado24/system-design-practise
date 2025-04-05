package com.machado.lld.observerpattern.oberserver;

import com.machado.lld.observerpattern.observable.ObservableInterface;

import java.util.Objects;

public class EmailObserver implements ObserverInterface{

    ObservableInterface observable;
    String email;

    public EmailObserver(String email, ObservableInterface observableInterface){
        this.observable = observableInterface;
        this.email = email;
        if(Objects.nonNull(observableInterface))  observable.register(this);
    }
    @Override
    public void update() {
        System.out.println("Sending message to " + email + " that the data is increased from 0 to " + this.observable.getData());
    }
}
