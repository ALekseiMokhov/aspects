package controllers;

@org.springframework.stereotype.Controller
public class Controller implements IController {
    public void print(){
        System.out.println("Hello from controller bean!");
    }
}
