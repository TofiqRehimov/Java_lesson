//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /// Animals
//        int number = new Animals().data();
//        System.out.println(number);
//        var plus = new Animals();

        /// Cars Method
        Cars car1 = new Cars();
        var name = car1.setName("BMW");
        var carsClass = car1.setCarsClass("Suv");
        car1.setSpeed(213);

//        System.out.println("Car name: "+name + " Cars Class:  " + carsClass+" Speed: " + car1.getSpeed());

        BMW bmw =new BMW();
        Mercedes mrc = new Mercedes();
        System.out.println(bmw.getName()+ " "+ bmw.getCarsClass()+ " " + bmw.getSpeed());
        System.out.println(mrc.getName()+ " "+ mrc.getCarsClass()+ " " + mrc.getSpeed());
    }

}