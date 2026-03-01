package dev.fluhongprogrammer.springannotations.config;

import dev.fluhongprogrammer.springannotations.controller.PizzaController;
import dev.fluhongprogrammer.springannotations.service.IvanPizza;
import dev.fluhongprogrammer.springannotations.service.Pizza;
import dev.fluhongprogrammer.springannotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    // Configuring the name of the @Bean
    @Bean(name = "vegPizzaBean")
    public Pizza vegPizza()
    {
        return new VegPizza();
    }

    @Bean
    public Pizza ivanPizza()
    {
        return new IvanPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController()
    {
        return  new PizzaController(vegPizza());
    }
}
