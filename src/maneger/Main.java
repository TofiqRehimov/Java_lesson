package maneger;

public class Main {
public static void main(String[] args) {
    Employee emp = new Employee(1,"ali",10, "dev");
     emp.work();
     Menecer men = new Menecer(1, "Ramazan", 5, "teamLider ",20);
     men.work();
     Director drector =new Director(1,"Hesen", 2, "ITT",50 );
     drector.work();

}
}
