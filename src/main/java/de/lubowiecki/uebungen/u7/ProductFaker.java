package de.lubowiecki.uebungen.u7;

import java.util.Random;

public class ProductFaker {

    private Random rand = new Random();

    private String[] names = {"Tasse", "Mütze", "Tee", "Lampe", "Kanne", "Tasche"};
    private String[] descriptions = {"100% Wolle", "Keramik, blau", "Keramik, gelb", "Earl Grey", "Kuststoff"};
    private double[] prices = {19.99, 12.29, 72.80, 10.99, 2.99, 15.33, 18.77, 10.00, 6.99};

    public int getRandNumber(int size) {
        return rand.nextInt(size);
    }

    public Product[] fake(int count) {
        Product[] products = new Product[count];

        for (int i = 0; i < count; i++) {
            products[i] = new Product(i + 1,
                    names[getRandNumber(names.length)],
                    descriptions[getRandNumber(descriptions.length)],
                    getRandNumber(200),
                    prices[getRandNumber(prices.length)]);
        }
        return products;
    }

}
