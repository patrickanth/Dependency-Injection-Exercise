package co.dependencyinjection.dependencyInex.servicies;

import co.dependencyinjection.dependencyInex.servicies.MyComponent;

public class MyService {

    private MyComponent myComponent;

    public MyService(MyComponent myComponent){
        this.myComponent = myComponent;
        System.out.println("MyService Constructor");
    }

    public String getname(){
        return myComponent.getMyComponentName();
    }

}
