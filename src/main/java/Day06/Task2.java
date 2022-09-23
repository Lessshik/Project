package Day06;

public class Task2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ivanov", "math");
        Student student = new Student("Leschik");
        teacher.evaluate(student);
    }
}

class Teacher{
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate (Student student){
        int grade = (int)(Math.random()*4+2);
        String gradeStr="";
        switch (grade) {
            case 2:
                gradeStr="неуд";
                break;
            case 3:
                gradeStr="уд";
                break;
            case 4:
                gradeStr="хор";
                break;
            case 5:
                gradeStr="отл";
                break;
            default:
                System.out.println("_____");
        }
        System.out.println("Преподаватель "+this.name
                        + " оценил студента с именем " + student.getName()
                        + " по предмету "+this.subject
                        + " на оценку - " + gradeStr);
    }
}

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
