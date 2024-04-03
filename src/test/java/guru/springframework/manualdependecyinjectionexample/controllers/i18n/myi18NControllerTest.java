package guru.springframework.manualdependecyinjectionexample.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("ES")
class myi18NControllerTest {

    @Autowired
    myi18NController myi18NController;


    @Test
    void sayHello() {
        System.out.println(myi18NController.sayHello());
    }
}