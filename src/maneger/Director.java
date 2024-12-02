package maneger;

public class Director extends Menecer {
    public double salaryDrector;
    public int bonus;
    public Employee employee;

    public Director(int no, String name, int year, String department, int bonus, double salaryDrector) {
        super(no, name, year, department, bonus);
        this.salaryDrector = salaryDrector;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        double salary = employee.calculateSalary() + super.calculateSalary();
        return salaryDrector + salary;
    }

     public void work(){
        System.out.println(name + " " + year + " ildi " + department
                + " departamentinde Direcktor isleyir " + calculateSalary()+ " AZN emek haqqi ve " + bonus+ " AZN bonus alir");
     }


}
