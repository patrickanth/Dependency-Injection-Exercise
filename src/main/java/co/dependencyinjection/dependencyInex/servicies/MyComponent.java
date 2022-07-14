package co.dependencyinjection.dependencyInex.servicies;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import java.lang.String;

import javax.websocket.server.PathParam;
@Component
public class MyComponent {


    private final String myComponentvariable;


    public MyComponent() {
        this.myComponentvariable = "Patrick";

        System.out.println("MyComponent Constructor");
    }


    public String getMyComponentName(){
        return myComponentvariable;
    }
}
