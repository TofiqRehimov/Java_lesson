package maneger;

public class Main {
public static void main(String[] args) {
    Employee emp = new Employee(1,"ali",1, "dev");
     emp.work();
     Menecer men = new Menecer(1, "Ramazan", 1, "teamLider ",1);
     men.work();
     Director drector =new Director(1,"Hesen", 1, "ITT",10,1);
     drector.work();

}
}
