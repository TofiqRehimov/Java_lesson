package products;

import java.util.Objects;

public class Products {
    private String productName;
    private int productPrice;
    private String prodcutCategory;
    private int id;

    public Products(int id, String productName, int productPrice, String prodcutCategory) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.prodcutCategory = prodcutCategory;

    }

    public Products() {

    }

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProdcutCategory(String prodcutCategory) {
        this.prodcutCategory = prodcutCategory;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public String getProdcutCategory() {
        return prodcutCategory;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", prodcutCategory='" + prodcutCategory + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
//        if(id == products.id) return true;
        return productPrice == products.productPrice || id == products.id || Objects.equals(productName, products.productName)
                || Objects.equals(prodcutCategory, products.prodcutCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice, prodcutCategory, id);
    }
    public void idTest(){
        if(id ==id){
            System.out.println("Id eynidir");
        }
    }
}
