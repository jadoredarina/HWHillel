package Profession;

public class AutomationEngineer extends Employee {
    private final String lastName;

    public AutomationEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPosition() {
        return "Automation Engineer";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }

    @Override
    public String getInfo() {
        return name + " " + lastName + " is a " + getSeniority() + " " + getPosition();
    }
}
