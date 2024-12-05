package funtionInterface;

import java.time.LocalDate;
import java.util.Objects;

public class Humman {
    private String name;
    private int age;
    private   LocalDate bday;

    public Humman() {}

    public Humman(String name, int age, LocalDate bday) {
        this.name = name;
        this.age = age;
        this.bday = bday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBday() {
        return bday;
    }

    public void setBday(LocalDate bday) {
        this.bday = bday;
    }

    @Override
    public String toString() {
        return "Humman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bday=" + bday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Humman humman = (Humman) o;
        return age == humman.age && Objects.equals(name, humman.name) && Objects.equals(bday, humman.bday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, bday);
    }
}
