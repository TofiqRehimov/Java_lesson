package Comparate;

public class Employee  implements Comparable<Employee>{
    private  String name;
    private  int age;
    private  int salary;
//    Comparable  compareTo, Compator compare


    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee emp1) {
//        return Integer.compare(this.getAge(), emp1.getAge());
//    return Integer.compare(this.getAge(), emp1.getAge());
        return this.getName().compareTo(emp1.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
