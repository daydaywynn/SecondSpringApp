package guru.springframework.manualdependecyinjectionexample.controllers.diAssignment;

import guru.springframework.manualdependecyinjectionexample.Services.GetDataSource;
import guru.springframework.manualdependecyinjectionexample.Services.GetDataSourceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles
class DIAssignmentControllerTest {

    @Autowired
    DIAssignmentController diAssignmentController;


    @Test
    void getEnv() {
        System.out.println(diAssignmentController.getEnv());
    }
}