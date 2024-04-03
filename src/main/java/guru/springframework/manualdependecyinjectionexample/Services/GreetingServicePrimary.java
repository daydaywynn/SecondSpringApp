package guru.springframework.manualdependecyinjectionexample.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class GreetingServicePrimary implements GreetingService{

    @Override
    public String sayGreeeting() {
        return "Hello from Primary Bean!";
    }
}
