package dev.fluhongprogrammer.springannotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class IvanPizza implements Pizza
{
    @Override
    public String getPizza()
    {
        return "Ivan Pizza";
    }

}
