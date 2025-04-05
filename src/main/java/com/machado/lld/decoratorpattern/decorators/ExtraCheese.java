package com.machado.lld.decoratorpattern.decorators;

import com.machado.lld.decoratorpattern.baseclasess.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}
