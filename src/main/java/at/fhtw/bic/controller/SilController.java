package at.fhtw.bic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SilController {

    @GetMapping("/circle/{num}")
    double calcCirceArea(@PathVariable double num) {
        return (num * num)* 3.14159265;
    }

}
