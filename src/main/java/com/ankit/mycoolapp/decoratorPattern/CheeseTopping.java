package com.ankit.mycoolapp.decoratorPattern;

public class CheeseTopping extends ExtraTopping{
    BasePizza basePizza ;

    public CheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+15 ;
    }
}
