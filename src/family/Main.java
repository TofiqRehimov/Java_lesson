package family;

public class Main {
    public static void main(String[] args) {
        var family = new Family();
        Object[] arrFamily = {family.setFamilyName("Rehimov"), family.setGender("Man"), family,
                family.setAge(34), family.setChild("Ramazan"), family.Add("Ayan"), family};


        for (int i = 0; i < arrFamily.length; i++) {
            System.out.println(arrFamily.length);
        }

        for (int i = 0; i < arrFamily.length; i++) {
//            System.out.println(arrFamily.length);
        }
    }
}
