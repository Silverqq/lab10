public class Director extends Person {

    public Director(String fullName, int yearOfBirth, double salary) {
        super(fullName, yearOfBirth, salary);
    }

    @Override
    public void info() {
        System.out.println("Директор:");
        System.out.println("ФИО: " + getFullName());
        System.out.println("Год рождения: " + getYearOfBirth());
        System.out.println("Размер зарплаты: " + getSalary());
    }
}
