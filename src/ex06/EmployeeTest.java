package ex06;

class Person{
    String name;
    public Person(){}
    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person{
    String id;
    public Employee(){
        super();
    }
    public Employee(String name){
        super(name);
    }
    public Employee(String name, String id){
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("Kim","20210001");
        System.out.println(e);
    }
}
