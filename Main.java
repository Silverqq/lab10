public class Main {
    public static void main(String[] args) {
        Director director = new Director("Ходяков Петр Александрович", 1970, 500000);
        DepartmentManager departmentManager = new DepartmentManager("Корн Вячеслав Михайлович", 1980, 150000);
        Worker worker = new Worker("Пресняков Геннадий Витальевич", 1990, 50000);

        director.info();
        System.out.println();
        departmentManager.info();
        System.out.println();
        worker.info();
    }
}
