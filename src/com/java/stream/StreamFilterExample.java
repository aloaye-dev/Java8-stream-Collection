package com.java.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {

            List<Product> list = new ArrayList<Product>();
            for (Product product : getProducts()) {
                if (product.getPrice() > 25000f) {
                    list.add(product);
                }
            }

        for (Product product: list){
            System.out.println(product);
        }
        System.out.println("################################################");

        //// Using Stream API
        getProducts().stream().filter((product)-> product.getPrice() > 25000f).forEach(System.out::println);







    }
    private static  List<Product> getProducts(){

        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenovo Laptop", 28000f));
        productList.add(new Product(4, "Sony Laptop", 29000f));
        productList.add(new Product(5, "Apple Laptop", 90000f));

        return productList;
    }

}
class Product {
    private  int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}