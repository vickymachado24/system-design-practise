package com.machado.lld.observerpattern.observable;

import com.machado.lld.observerpattern.oberserver.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public interface ObservableInterface {



    void register(ObserverInterface observer);

    void deRegister(ObserverInterface observer);

    void setData(int data);

    int getData();

    void notifyObservers();
}
