package guru.springframework.manualdependecyinjectionexample.controllers;

import guru.springframework.manualdependecyinjectionexample.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingService")
    @Autowired //Needs to be here because it is a property level injection. Not Recommended
    GreetingService greetingService;
    public String sayHi(){
        return greetingService.sayGreeeting();
    }
}
