package demo;

public class Person {
    private Job job;
    Person(){
        this.job=new Job();
        job.setSalary(1500);
    }
    public int getSalary(){
        return job.getSalary();
    }
}
class demo{
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p.getSalary());
    }
}
