package dev.fluhongprogrammer.springannotations.controller;

import dev.fluhongprogrammer.springannotations.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @Autowired
    private EmailService emailService;

    @GetMapping("/test")
    public String test()
    {
        emailService.sendEmail();
        return "Done";
    }


    public void getTest()
    {
        try
        {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(2000);
                emailService.sendEmail();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
