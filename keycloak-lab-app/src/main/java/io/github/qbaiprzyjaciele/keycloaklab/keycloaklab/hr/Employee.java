package io.github.qbaiprzyjaciele.keycloaklab.keycloaklab.hr;

public class Employee {

    private final String name;
    private final String lastName;
    private final Position position;

    public Employee(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }
}
