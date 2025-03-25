package arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Emplee {
    String id;
    String name;
    static int   age=20;

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
    

    @Override
	public String toString() {
		return "Emplee [id=" + id + ", name=" + name + ", pos=" + pos + ", salary=" + salary + "]";
	}

	public  Emplee(String id, String name,int pos,double salary){
        this.id=id;
        this.name=name;
        this.pos=pos;
        this.salary=salary;
    }
public static void main(String args[]){
        Emplee e1=new Emplee("100", "imran",1,10.0);
        Emplee e2=new Emplee("101", "simran",2,20.8);
        Emplee e3=new Emplee("102", "rayan",3,12.9);
        Emplee e4=new Emplee("102", "imran",3,12.9);
        Emplee e5=new Emplee("102", "imran",3,10.9);
        Emplee e6=new Emplee("102", "imran",3,10.9);
        List<Emplee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
list.add(e4);
        list.add(e5);
        list.add(e6);
        List<Emplee> sortedEmp= list.stream().sorted(Comparator.comparing(Emplee :: getName)
        		.thenComparing(Emplee :: getId,Comparator.reverseOrder())).collect(Collectors.toList());
        sortedEmp.forEach(System.out:: println);
        
        }

}