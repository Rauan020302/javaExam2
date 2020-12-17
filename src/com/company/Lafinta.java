package com.company;

public class Lafinta extends Pizza{
    private boolean mushroom;
    private static int numOfLafinta;

    public Lafinta(int price, double weight, boolean mushroom) {
        super(price, weight);
        this.mushroom = mushroom;
        numOfLafinta++;
    }

    @Override
    public void cook() {
        System.out.println("готовится пицца ла финта №" + numOfLafinta);
    }

    @Override
    public void delivery() {
        System.out.println("Ла Финта доставлена!");
        System.out.println("Пицца Ла Финта \n цена - " + price + ",вес - " + weight + ",наличие грибов - " + mushroom);
    }

    @Override
    public void SomePizza() {
        System.out.println("Пицца Ла Финта \n цена - " + price + ",вес - " + weight + ",наличие грибов - " + mushroom);
    }

    public boolean isMushroom() {
        return mushroom;
    }

    public void setMushroom(boolean mushroom) {
        this.mushroom = mushroom;
    }
}

