package com.company;

public class Pizza {
    int price;
    double weight;
    static int numOfPizza;

    public Pizza(int price, double weight) {
        this.price = price;
        this.weight = weight;
        numOfPizza++;
    }
    public void cook(){
        System.out.println("Пицца готова!" + numOfPizza);
    }
    public void delivery(){
        System.out.println("Пицца доставлена!");
    }
    public void SomePizza(){
        System.out.println("Пицца \n цена - " + price + ",вес - " + weight);
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

