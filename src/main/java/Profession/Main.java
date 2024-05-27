package Profession;

public class Main {
    public static void main(String[] args) {
        Employee tom = new JavaDeveloper("Tom");
        Employee bill = new AngularDeveloper("Bill");
        Employee misha = new AutomationEngineer("Misha", "Aksani");
        Employee john = new ManualTestEngineer("John", "Smith");
        Manager william = new Manager("William", "Underwood");

        william.setTeamMembers(tom, bill, misha, john);

        System.out.println(tom.getInfo());
        System.out.println(bill.getInfo());
        System.out.println(misha.getInfo());
        System.out.println(john.getInfo());
        System.out.println(william.getInfo());
    }
}
