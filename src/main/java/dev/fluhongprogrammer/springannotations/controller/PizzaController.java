package dev.fluhongprogrammer.springannotations.controller;

import org.springframework.stereotype.Component;

/**
 *  @Component is an annotation used to tell Spring:
 *  “This class is a Spring-managed bean. Create an object of this class automatically and manage it inside the Application Context.”
 *
 * */

@Component
public class PizzaController
{
    public String getPizza()
    {
        return "Hot Pizza!";
    }
}
