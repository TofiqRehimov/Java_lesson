package maneger;

public class Menecer extends Employee {

    public String departamentManaged;
    public static final  int MANAGMENT_PAYMENT = 10;
    public int bonus;


    public Menecer(int no, String name, int year, String department,int bonus) {
        super(no, name, year, department);
        this.departamentManaged = department;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary(){
        double salary = super.calculateSalary();
        return MANAGMENT_PAYMENT + salary ;
    }
    public void work(){
//        super.work();

        System.out.println(name +  " "  + year + " ildi "  +department +  "departamentinde  Menicer isleyir "+
                calculateSalary() + " AZN emek haqqi ve " + bonus + " AZN  bonus alir");
    }

}
