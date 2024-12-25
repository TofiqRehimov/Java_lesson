package personPhone;

import java.util.List;

public class Person {
    private String name;
    private List<Phone> phoneNumber;
    public Person(String name,List <Phone> phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public List<Phone> getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return name;
    }
}
