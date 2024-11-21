public class Humman {
    private String name;
    private int age;
    private String gender;
    private Humman mother;


    public Humman(){

    }

    public Humman(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return this.name;
    }

    public String setName(String name) {
            return this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
    return this.age = age;
    }

    public String getGender() {
    return gender;
    }

    public String setGender(String gender) {
        return this.gender = gender;
    }

}
