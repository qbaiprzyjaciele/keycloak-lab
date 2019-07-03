package io.github.qbaiprzyjaciele.keycloaklab.keycloaklab.banking;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(value = "*")
public class AccountsController {

    @GetMapping(value = "/test")
    public String test() {
        return "OK";
    }

    @GetMapping(value = "/secured/accounts")
    public List<Account> getAccounts() {
        return Arrays.asList(
                new Account("Primary account", "10101010"),
                new Account("Secondary account", "2020202020"));

    }



}
