package Profession;

public class JavaDeveloper extends Employee {

    public JavaDeveloper(String name) {
        super(name);
    }

    @Override
    public String getPosition() {
        return "Java Developer";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }

    @Override
    public String getInfo() {
        return name + " is a " + getSeniority() + " " + getPosition();
    }
}
