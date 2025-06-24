
class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display() {
       System.out.println("Name : " +name+ ", Age: "+age);
    }
}
class Employee extends Person{
    String company;
    int employeeId;

    public Employee(String name, int age, String company, int employeeId){
        super(name, age);
        this.company=company;
        this.employeeId=employeeId;
    }
    public void display(){
        System.out.println("Company : " +company+ ", EmployeeId: "+employeeId);
    }
}
class Student extends Person{
    String school;
    int grade;

    public Student(String name, int age, String school, int grade){
        super(name, age);
        this.school=school;
        this.grade=grade;
    }
    public void display(){
        System.out.println("School : " +school+ ", Grade: "+grade);
    }
}


public class Inheritance {
    public static void main(String args[]){
        Employee emp = new Employee("Praseeda", 25, "Virtusa", 12345 );
        Student student = new Student("Pras", 17, "CMR", 90);
        emp.display();
        student.display();
    }
}
