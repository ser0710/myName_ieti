package edu.escuelaing.ieti.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class MyNameController {
    @GetMapping
    public String name(){
        return "Sergio Rozo";
    }
}
