package products;

public class Main {
    public static void main(String[] args) {
        var Product = new Products(1, "Acer", 1500, "Compyter");
        var Product2 = new Products(2, "Sumsung", 2500, "Compyte");
        var Product3= new Products(1, "Acer", 1500, "Compyte");
        var Product4= new Products(1, "Acer", 1500, "Compyte");

        for(int i = 0; i<= new Products().getId(); i++){
            System.out.println(new Products().setId(i));
        }
        System.out.println(Product.equals(Product3) );
        System.out.println(Product.equals(Product2) );


       int i=0;
       do{
           System.out.println(i);
           i++;
       }
       while(i<3);
     }
}
