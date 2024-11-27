package Maneger;

public class Director extends Menecer{
    public double bonus;

    public Director(int no, String name, int year, String department, int bonus) {
        super(no, name, year, department, bonus);
        this.bonus = bonus;
    }

    public double calculateSalary(){
        double salary = super.calculateSalary();
        return  salary;
    }
     public void work(){
        System.out.println(name + " " + year + " ildi " + department
                + " departamentinde Direcktor isleyir " + calculateSalary()+ " AZN emek haqqi ve " + bonus+ " AZN bonus alir");
     }


}
