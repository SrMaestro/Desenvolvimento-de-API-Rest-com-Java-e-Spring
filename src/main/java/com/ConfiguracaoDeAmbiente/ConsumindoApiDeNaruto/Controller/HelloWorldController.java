package com.ConfiguracaoDeAmbiente.ConsumindoApiDeNaruto.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String printHelloWorld(){
        return "Helllo World";
    }
}
