package guru.springframework.manualdependecyinjectionexample.Services;

import org.springframework.stereotype.Service;

@Service("setterGreeteingBean")
public class GreetingServiceSetterInjected implements GreetingService{
    @Override
    public String sayGreeeting() {
        return "I'm setting a greeetting!";
    }
}
