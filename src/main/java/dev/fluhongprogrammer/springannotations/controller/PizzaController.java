package dev.fluhongprogrammer.springannotations.controller;

import dev.fluhongprogrammer.springannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pizzaController")
public class PizzaController
{

    @Autowired
    private VegPizza vegPizza;

//    @Autowired
//    public PizzaController(VegPizza vegPizza)
//    {
//         this.vegPizza = vegPizza;
//    }

//    @Autowired
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getPizza()
    {
        return vegPizza.getPizza();
    }
}
