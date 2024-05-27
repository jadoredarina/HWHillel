package Profession;

public class AngularDeveloper extends Employee {

    public AngularDeveloper(String name) {
        super(name);
    }

    @Override
    public String getPosition() {
        return "Angular Developer";
    }

    @Override
    public String getSeniority() {
        return "Middle";
    }

    @Override
    public String getInfo() {
        return name + " is a " + getSeniority() + " " + getPosition();
    }
}
