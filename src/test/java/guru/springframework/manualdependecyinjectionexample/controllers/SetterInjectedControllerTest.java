package guru.springframework.manualdependecyinjectionexample.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SetterInjectedControllerTest {


    @Autowired
    SetterInjectedController setterInjectedController;

    @Test
    void sayHi() {
        System.out.println(setterInjectedController.sayHi());
    }
}