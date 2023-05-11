public class Main {
    public static void main(String[] args) {
        Director director = new Director("Иванов Иван Иванович", 1970, 500000);
        DepartmentManager departmentManager = new DepartmentManager("Петров Петр Петрович", 1980, 150000);
        Worker worker = new Worker("Сидоров Сидор Сидорович", 1990, 50000);

        director.info();
        System.out.println();
        departmentManager.info();
        System.out.println();
        worker.info();
    }
}