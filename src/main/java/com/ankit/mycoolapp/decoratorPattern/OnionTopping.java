package com.ankit.mycoolapp.decoratorPattern;

public class OnionTopping extends ExtraTopping{
    BasePizza basePizza;

    public OnionTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
     public int cost() {
        return basePizza.cost()+25;
    }
}
