package dev.fluhongprogrammer.springannotations;

import dev.fluhongprogrammer.springannotations.config.AppConfig;
import dev.fluhongprogrammer.springannotations.controller.MyController;
import dev.fluhongprogrammer.springannotations.controller.PizzaController;
import dev.fluhongprogrammer.springannotations.repository.MyRepository;
import dev.fluhongprogrammer.springannotations.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringAnnotationsApplication
{

	public static void main(String[] args)
	{
		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
		//System.out.println("Spring annotations course, let's go!!!!");
		//UserController usercontroller = context.getBean(UserController.class);
	 	//usercontroller.getTest();

		AnnotationConfigApplicationContext content =  new AnnotationConfigApplicationContext(AppConfig.class);

//		PizzaController pizzacontroller = context.getBean(PizzaController.class);
		PizzaController pizzacontroller = (PizzaController) context.getBean("pizzaController");
		System.out.println(pizzacontroller.getPizza());

		content.close(); // close the stream - this is very important in order to run the init and destroy of the @Bean

//		VegPizza vegPizza = context.getBean(VegPizza.class);
//		VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean");
//		System.out.println(vegPizza.getPizza());


		MyController mycontroller = (MyController) context.getBean("myController");
		System.out.println(mycontroller.hello());

		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.hello());

		MyRepository myrepository = context.getBean(MyRepository.class);
		System.out.println(myrepository.hello());
	}

}
