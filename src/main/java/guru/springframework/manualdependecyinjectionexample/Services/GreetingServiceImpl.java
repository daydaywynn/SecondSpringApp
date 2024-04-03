package guru.springframework.manualdependecyinjectionexample.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service //Create a spring component and indicate it as a Service
@Primary
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeeting() {
        return "Hi from base service";
    }
}
