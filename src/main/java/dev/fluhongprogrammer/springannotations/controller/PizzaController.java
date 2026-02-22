package dev.fluhongprogrammer.springannotations.controller;

import dev.fluhongprogrammer.springannotations.service.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pizzaController")
public class PizzaController implements Pizza
{

    private final  Pizza pizza;

    //  ivanPizza - name of the file
    //  @Qualifier("name") matches: - The bean name registered in the Spring container
    @Autowired
    public PizzaController(@Qualifier("ivanPizza") Pizza pizza) {
        this.pizza = pizza;
    }

    //    @Autowired
//    private VegPizza vegPizza;

//    @Autowired
//    public PizzaController(VegPizza vegPizza)
//    {
//         this.vegPizza = vegPizza;
//    }

//    @Autowired
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    @Override
    public String getPizza()
    {
        return pizza.getPizza();
    }
}
