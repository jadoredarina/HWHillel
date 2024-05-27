package Profession;

public class ManualTestEngineer extends Employee {
    private final String lastName;

    public ManualTestEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPosition() {
        return "Manual Test Engineer";
    }

    @Override
    public String getSeniority() {
        return "Junior";
    }

    @Override
    public String getInfo() {
        return name + " " + lastName + " is a " + getSeniority() + " " + getPosition();
    }
}
