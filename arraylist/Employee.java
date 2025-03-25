package arraylist;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    String id;
    String name;

    int pos;

    double salary;
    static {
        System.out.println("Static");
    }
    {
        System.out.println("non Static");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public  Employee(String id, String name,int pos,double salary){
        this.id=id;
        this.name=name;
        this.pos=pos;
        this.salary=salary;
    }
public static void main(String args[]){
        Employee e1=new Employee("100", "imran",1,10.0);
        Employee e2=new Employee("101", "simran",2,20.8);
        Employee e3=new Employee("102", "rayan",3,12.9);
        Employee e4=new Employee("102", "imran",3,12.9);
        Employee e5=new Employee("102", "imran",3,10.9);
        Employee e6=new Employee("102", "imran",3,10.9);
        List<Employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
list.add(e4);
        list.add(e5);
        list.add(e6); }}