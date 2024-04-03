package guru.springframework.manualdependecyinjectionexample.Services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")

public class GreetingServicePropertyInjected implements GreetingService{
    @Override
    public String sayGreeeting() {
        return "Friends don't let friends property injection!";
    }
}
