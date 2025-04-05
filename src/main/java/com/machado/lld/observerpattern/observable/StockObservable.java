package com.machado.lld.observerpattern.observable;

import com.machado.lld.observerpattern.oberserver.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class StockObservable implements ObservableInterface{

    List<ObserverInterface> observers;
    int data = 0;


    public StockObservable(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void register(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void deRegister(ObserverInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void setData(int data) {
        if( this.data == 0){
            this.data = data;
            notifyObservers();
        }
        else this.data = data;
    }

    @Override
    public int getData() {
        return this.data;
    }

    @Override
    public void notifyObservers() {
        System.out.println("Subscription message triggering");
        for( ObserverInterface observer : this.observers) observer.update();
        System.out.println("Subscription message triggered");
    }
}
