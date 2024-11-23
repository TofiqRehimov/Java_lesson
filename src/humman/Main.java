package humman;

public class Main {
    public static void main(String[] args) {
        var humman = new Humman();
        Object[] arrHumman = {humman.setName("Jack"), humman.setGender("Man"), humman.setAge(5)};
        for (int a = 0; a <= arrHumman.length; a++) {
            System.out.println(arrHumman[a]);

        }


    }
}
