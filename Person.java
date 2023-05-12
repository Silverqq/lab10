public abstract class Person {
    private String fullName;
    private int yearOfBirth;
    private double salary;

    public Person(String fullName, int yearOfBirth, double salary) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public abstract void info();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
