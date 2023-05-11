public class Worker extends Person {

    public Worker(String fullName, int yearOfBirth, double salary) {
        super(fullName, yearOfBirth, salary);
    }

    @Override
    public void info() {
        System.out.println("Работник:");
        System.out.println("ФИО: " + getFullName());
        System.out.println("Год рождения: " + getYearOfBirth());
        System.out.println("Размер зарплаты: " + getSalary());
    }
}
