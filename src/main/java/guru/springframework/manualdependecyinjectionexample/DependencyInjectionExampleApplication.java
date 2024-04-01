package guru.springframework.manualdependecyinjectionexample;

import guru.springframework.manualdependecyinjectionexample.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExampleApplication {

    public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionExampleApplication.class, args);

		MyController controller = ctx.getBean(MyController.class); //gets the controller/bean


		System.out.println("In main");

		System.out.println(controller.sayHi());
    }

}
