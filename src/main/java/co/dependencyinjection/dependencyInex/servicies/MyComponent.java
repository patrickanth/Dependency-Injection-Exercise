package co.dependencyinjection.dependencyInex.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final String myComponent;


    public MyComponent(MyComponent myComponent) {
        this.myComponent = "Patrick";

        System.out.println("MyComponent Constructor");
    }

    public String getMyComponentName(){
        return myComponent;
    }
}
