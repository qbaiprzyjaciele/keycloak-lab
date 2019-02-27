package io.github.qbaiprzyjaciele.keycloaklab.keycloaklab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(name = "/test")
    public String test() {
        return "OK";
    }
}
