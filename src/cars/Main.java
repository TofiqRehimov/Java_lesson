package cars;

public class Main {
    public static void main(String[] args) {

        /// Cars Method
        Cars car1 = new Cars();
        var name = car1.setName("BMW");
        var carsClass = car1.setCarsClass("Suv");
        car1.setSpeed(213);

//        System.out.println("Car name: "+name + " Cars Class:  " + carsClass+" Speed: " + car1.getSpeed());

        Bmw bmw = new Bmw();
        Mercedes mrc = new Mercedes();
        System.out.println(bmw.getName() + " " + bmw.getCarsClass() + " " + bmw.getSpeed());
        System.out.println(mrc.getName() + " " + mrc.getCarsClass() + " " + mrc.getSpeed());
    }
}
