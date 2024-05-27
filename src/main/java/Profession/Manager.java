package Profession;

import java.util.Arrays;

public class Manager extends Employee {
    private final String lastName;
    private Employee[] team;

    public Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public void setTeamMembers(Employee... members) {
        this.team = members;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPosition() {
        return "Manager";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }

    @Override
    public String getInfo() {
        String teamMembers = Arrays.toString(Arrays.stream(team).map(Employee::getName).toArray(String[]::new));
        return name + " " + lastName + " is a " + getSeniority() + " " + getPosition() + " and has a team of " + team.length + " members: " + teamMembers;
    }
}
