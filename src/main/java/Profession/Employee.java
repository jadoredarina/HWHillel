package Profession;

    public abstract class Employee {
        protected final String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract String getPosition();

        public abstract String getSeniority();

        public abstract String getInfo();
    }

