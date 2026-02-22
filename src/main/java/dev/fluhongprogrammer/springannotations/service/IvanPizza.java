package dev.fluhongprogrammer.springannotations.service;

import org.springframework.stereotype.Component;

@Component
public class IvanPizza implements Pizza
{
    @Override
    public String getPizza()
    {
        return "Ivan Pizza";
    }

}
