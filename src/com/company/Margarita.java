package com.company;

public class Margarita extends Pizza{
    private boolean meat ;
    private static int numOfMargarita;

    public Margarita(int price, double weight, boolean meat) {
        super(price, weight);
        this.meat = meat;
        numOfMargarita++;
    }

    @Override
    public void cook() {
        System.out.println("готовится пицца маргарита №" + numOfMargarita);
    }

    @Override
    public void delivery() {
        System.out.println("Маргарита доставлена!");
        System.out.println("Пицца Маргарита \n цена - " + price + ",вес - " + weight + ",наличие мяса - " + meat);
    }

    @Override
    public void SomePizza() {
        System.out.println("Пицца Маргарита \n цена - " + price + ",вес - " + weight + ",наличие мяса - " + meat);
    }

    public boolean isMeat() {
        return meat;
    }

    public void setMeat(boolean meat) {
        this.meat = meat;
    }
}

