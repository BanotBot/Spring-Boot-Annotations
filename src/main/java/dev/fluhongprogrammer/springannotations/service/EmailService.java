package dev.fluhongprogrammer.springannotations.service;

import org.springframework.stereotype.Component;

/**
 *  @Component is an annotation used to tell Spring:
 *  “This class is a Spring-managed bean. Create an object of this class automatically and manage it inside the Application Context.”
 *  Without @Component, Spring does not know your class exists.
 *  @Component =
 *    ✔ Register class as Spring Bean
 *    ✔ Let Spring manage it
 *    ✔ Allow dependency injection
 *
 * */

@Component
public class EmailService
{

   public void sendEmail()
   {
      System.out.println("Sending email...");
   }

}
