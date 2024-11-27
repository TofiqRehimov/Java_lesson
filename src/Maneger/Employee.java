package Maneger;

public class Employee {
    public int no;
    public String name;
    public int year;
    public String department;
    public static final int BASE_SAlARY = 5;

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }
    public double calculateSalary() {
        return BASE_SAlARY * this.year;
    }
    public void work(){
        System.out.println( name + " " +year +" ildir " + department+ " departamentinde isleyir " +calculateSalary() + " AZN emek haqqi alir" );

    }




}
