public class Employee implements RegisterForExams{
    private String name;
    private String date;
    private int salary;
    public Employee()
    {
        name = null;
        date = null;
        salary = 0;
    }
    public Employee(String name,String date,int salary)
    {
        this.name = name;
        this.date = date;
        this.salary = salary;
    }

    @Override
    public void register() {
        System.out.println("Name " + name + "\nsalary " + salary + "\n Employee reistered on date " + date);
    }
}
