package guru.springframework.manualdependecyinjectionexample.controllers.diAssignment;

import guru.springframework.manualdependecyinjectionexample.Services.GetDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DIAssignmentController {

    public final GetDataSource getDataSource;


    public DIAssignmentController( @Qualifier("Envs") GetDataSource getDataSource) {
        this.getDataSource = getDataSource;
    }

    public String getEnv(){
        return getDataSource.getDS();
    }
}
