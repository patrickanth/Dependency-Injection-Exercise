package co.dependencyinjection.dependencyInex.servicies;

import co.dependencyinjection.dependencyInex.servicies.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService  {

    private MyComponent myComponentvariable;
    @Autowired
    public MyService(MyComponent myComponentvariable){
        this.myComponentvariable = myComponentvariable;
        System.out.println("MyService Constructor");
    }

    public String getname(){
        return myComponentvariable.getMyComponentName();
    }

}
