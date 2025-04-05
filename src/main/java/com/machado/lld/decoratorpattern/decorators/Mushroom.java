package com.machado.lld.decoratorpattern.decorators;

import com.machado.lld.decoratorpattern.baseclasess.BasePizza;

public class Mushroom extends ToppingDecorator {

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 25;
    }

}
