package guru.springframework.manualdependecyinjectionexample.Services.EnvAssignment;

import guru.springframework.manualdependecyinjectionexample.Services.GetDataSource;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("Envs")
@Profile("Qa")
public class EnvsAssignmentQa implements GetDataSource {
    @Override
    public String getDS() {
        return "The DS is Qa!";
    }
}
