package guru.springframework.manualdependecyinjectionexample.Services.i18NServices;

import guru.springframework.manualdependecyinjectionexample.Services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("Languages")
@Profile("ES")
public class SpanishServices implements GreetingService {
    @Override
    public String sayGreeeting() {
        return "Hola!";
    }
}
