package Day09;

public class Task1 {
    public static void main(String[] args) {
        Student stud = new Student("Denis Lesch", "SP");
        Teacher teach = new Teacher("Ivanov Ivan", "Mosti i dorogi");

        System.out.println(stud.getWorkGroup());
        System.out.println(teach.getSubject());
        stud.printInfo();
        System.out.println();
        teach.printInfo();
    }
}
