package guru.springframework.manualdependecyinjectionexample.controllers;

import guru.springframework.manualdependecyinjectionexample.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    //@Qualifier("setterGreeteingBean") Cannot be here!
    private GreetingService greetingService;
    @Autowired
    //@Qualifier("setterGreeteingBean") Can be here too
    public void setGreetingService(@Qualifier("setterGreeteingBean") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){
        return greetingService.sayGreeeting();
    }
}
