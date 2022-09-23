package Day09;

public class Student extends Human{
    private String workGroup;

    public String getWorkGroup() {
        return workGroup;
    }

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    public Student(String name, String workGroup) {
        super(name);
        this.workGroup = workGroup;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем "+getName());
        }
}
