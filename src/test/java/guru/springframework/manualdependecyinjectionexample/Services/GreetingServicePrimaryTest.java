package guru.springframework.manualdependecyinjectionexample.Services;

import guru.springframework.manualdependecyinjectionexample.controllers.ConstructorInjectedController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GreetingServicePrimaryTest {

    @Autowired
    ConstructorInjectedController controller;
    @Test
    void sayGreeeting() {
        System.out.println( controller.sayHi());
    }
}