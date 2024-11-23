package products;

public class Main {
    public static void main(String[] args) {
        var Product = new Products(1, "Acer", 1500, "Compyter");
        var Product2 = new Products(2, "Sumsung", 2500, "Compyter");
        var Product3= new Products(3, "Acer", 1500, "Compyter");

        System.out.println(Product.equals(Product2));
     }
}
