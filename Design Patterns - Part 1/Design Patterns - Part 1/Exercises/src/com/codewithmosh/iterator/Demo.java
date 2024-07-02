package com.codewithmosh.iterator;

public class Demo {
    public static void main(String[] args) {
        var product1 = new Product(1, "salmon fillet");
        var product2 = new Product(2, "tofu");
        var product3 = new Product(3, "spinach");

        var productCollection = new ProductCollection();
        productCollection.add(product1);
        productCollection.add(product2);
        productCollection.add(product3);

        var iterator = productCollection.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
