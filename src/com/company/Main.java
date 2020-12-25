package com.company;

public class Main {

    public static void main(String[] args) {
        Pepperoni pizza1 = new Pepperoni(1250,6,true);
        pizza1.cook();
        pizza1.delivery();

        Pepperoni pizza2 = new Pepperoni(1100,5.5,false);
        pizza2.cook();
        pizza2.delivery();

        Margarita pizza3 = new Margarita(1000,5,true);
        pizza3.cook();
        pizza3.delivery();

        Margarita pizza4 = new Margarita(1150,6.4,false);
        pizza4.cook();
        pizza4.delivery();

        Lafinta pizza5 = new Lafinta(700,4,false);
        pizza5.cook();
        pizza5.delivery();

        Lafinta pizza6 = new Lafinta(2000,8,true);
        pizza6.cook();
        pizza6.delivery();

        System.out.println(Pizza.numOfPizza);



    }
}
