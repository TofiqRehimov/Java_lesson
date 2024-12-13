package stream;

public class Customer {
    private String name;
    private double debt;

    public Customer(String name, double debt) {
        this.name = name;
        this.debt = debt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDebt() {
        return debt;
    }


    public void setDebt(double debt) {
        this.debt = debt;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", debt=" + debt +
                '}';
    }
}
