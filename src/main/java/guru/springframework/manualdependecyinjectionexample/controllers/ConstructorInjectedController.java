package guru.springframework.manualdependecyinjectionexample.controllers;

import guru.springframework.manualdependecyinjectionexample.Services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * This is the way you wanna do dependency injection!
 * This is called injection by constructor!
 */
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService; //interface, not the Impl

    /**
     * Can only instantiate this class if you pass in a greeting service
     */
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){
        return greetingService.sayGreeeting();
    }

}
