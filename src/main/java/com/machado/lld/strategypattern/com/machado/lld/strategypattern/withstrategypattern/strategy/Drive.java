package com.machado.lld.strategypattern.com.machado.lld.strategypattern.withstrategypattern.strategy;

public interface Drive {

    /***
     * using this strategy pattern, we can have n implementations of Drive,
     * this is going to be an object in the actual parent of the Vehicle class
     * each of the extending class will basically use their preferred method of strategy of driving
     * and this will help us to remove redundant code and improve scalability
     */
    public void drive();
}
