package guru.springframework.manualdependecyinjectionexample.controllers;

import guru.springframework.manualdependecyinjectionexample.Services.GreetingService;

public class MyController {

    public final GreetingService greetingService;
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){
        System.out.println( "In the Controller!");
        return greetingService.sayGreeeting();
    }

}
