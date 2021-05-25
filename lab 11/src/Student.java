public class Student implements RegisterForExams{
    private String name;
    private int age;
    private double gpa;
    public Student()
    {
        name = null;
        age = 0;
        gpa = 0;
    }
    public Student(String name,int age,double gpa) {
        this.name = name;
        this.age = age;
        this.gpa=gpa;
    }



    @Override
    public void register() {
        System.out.println("Student name " + name + " gpa " + gpa);
    }
}
