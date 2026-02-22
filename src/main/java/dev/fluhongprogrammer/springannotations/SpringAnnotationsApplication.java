package dev.fluhongprogrammer.springannotations;

import dev.fluhongprogrammer.springannotations.controller.PizzaController;
import dev.fluhongprogrammer.springannotations.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsApplication
{

	public static void main(String[] args)
	{
		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
		//System.out.println("Spring annotations course, let's go!!!!");
		//UserController usercontroller = context.getBean(UserController.class);
	 	//usercontroller.getTest();

		PizzaController pizzacontroller = context.getBean(PizzaController.class);
		//PizzaController pizzacontroller = (PizzaController) context.getBean("pizzaController");
		System.out.println(pizzacontroller.getPizza());



	}

}
