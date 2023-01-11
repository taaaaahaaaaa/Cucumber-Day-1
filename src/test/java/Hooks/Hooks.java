package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("Before methodu çalıştı");
    }

    @After
    public void teardown(){
        System.out.println("After methodu çalıştı");
    }
}
