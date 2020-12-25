package com.company;

public class Pepperoni extends Pizza{
    private boolean spicy;
    static int numOfPepperoni;

    public Pepperoni(int price, double weight, boolean spicy) {
        super(price, weight);
        this.spicy = spicy;
        numOfPepperoni++;
    }

    @Override
    public void cook() {
        System.out.println("готовится пицца пепперони №" + numOfPepperoni);
    }

    @Override
    public void delivery() {
        System.out.println("Пепперони доставлен!");
        System.out.println("Пицца Пепперони \n цена - " + price + ",вес - "  + weight  + ", наличие остроты - " + spicy);
    }


    @Override
    public void SomePizza() {
        System.out.println("Пицца Пепперони \n цена - " + price + ",вес - "  + weight  + ", наличие остроты - " + spicy);
    }

    public boolean isSpicy() {
        return spicy;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }
}

