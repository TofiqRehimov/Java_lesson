package family;

public class Family {
    private String familyName;
    private int age;
    private String gender;
    private String Child ;


    public Family() {

    }
    public Family(String familyName, int age, String gender) {
        this.familyName = familyName;
        this.age = age;
        this.gender = gender;
        this.Child = null;



    }



    public String getFamilyName() {
    return familyName;
    }
    public String setFamilyName(String familyName) {
        return this.familyName = familyName;
    }
    public int getAge() {
            return this.age;
    }
    public int setAge(int age) {
        return this.age = age;
    }
    public String getGender() {
        return this.gender;
    }
    public String setGender(String gender) {
    return this.gender = gender;
    }
    public Object getChild() {
        return this.Child;

    }

    public String[] setChild(String Child) {
        return Add(Child);
    }
    public String[] Add (String Child) {
        for (var i = 0; i <= Child.length(); i++) {
//            System.out.print(Child+" ");
        }

        return new String[Child.length()];
    }
//    public String[] Delete (String Child) {
//        //            System.out.print(Child+" ");
//        for (var i = 0; i >= Child.length()-1; i++) Child = Child.substring(0, i) - Child.substring(i + 1);
//        return new String[0];
//    }








}
