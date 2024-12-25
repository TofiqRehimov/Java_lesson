package personPhone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Tofiq", Arrays.asList(new Phone("055-333-33-33"),new Phone("050-444-44-44"))),
                new Person("Tofiq", Arrays.asList(new Phone("055-333-33-33"))),
                new Person("Tofiq", Arrays.asList(new Phone("055-333-33-33"),new Phone("050-555-55-55"))),
                new Person("Tofiq", Arrays.asList(new Phone("055-333-33-33")))
        );

        List <String> phones = persons.stream().flatMap(person ->
            person.getPhoneNumber().stream()).map(Phone::getNumber).collect(Collectors.toList());
        System.out.println("Butun telefon nomreleri" + phones);
    }
}
