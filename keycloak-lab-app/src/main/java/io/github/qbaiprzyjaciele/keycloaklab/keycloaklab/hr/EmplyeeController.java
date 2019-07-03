package io.github.qbaiprzyjaciele.keycloaklab.keycloaklab.hr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/employee")
@RestController
public class EmplyeeController {

    @GetMapping("/")
    public List<Employee> employees() {
        return Arrays.asList(
                new Employee("Jan", "Kowalski", Position.ACCOUNTANT),
                new Employee("Andrzej", "Nowak", Position.TEAM_LEADER)
        );
    }

}
