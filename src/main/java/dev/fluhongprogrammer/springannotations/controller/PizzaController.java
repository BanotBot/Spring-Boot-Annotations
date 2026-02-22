package dev.fluhongprogrammer.springannotations.controller;

import org.springframework.stereotype.Component;

@Component("pizzaController")
public class PizzaController
{
    public String getPizza()
    {
        return "Hot pizza";
    }
}
