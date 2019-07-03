package io.github.qbaiprzyjaciele.keycloaklab.keycloaklab.banking;

public class Account {

    private final String name;
    private final String accountNo;

    public Account(String name, String accountNo) {
        this.name = name;
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public String getAccountNo() {
        return accountNo;
    }
}
