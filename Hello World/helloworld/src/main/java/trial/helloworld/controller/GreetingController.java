package trial.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {

    @GetMapping("/greeting")
    public String greet(@RequestParam(name="wizardName", required = false, defaultValue = "World") 
                        String name){
        return "Hello " + name + "!";
    }

}
