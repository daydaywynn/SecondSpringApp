package guru.springframework.manualdependecyinjectionexample.controllers.i18n;

import guru.springframework.manualdependecyinjectionexample.Services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class myi18NController {


    private final GreetingService greetingService;


    public myi18NController(@Qualifier("Languages") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return  greetingService.sayGreeeting();
    }


}
