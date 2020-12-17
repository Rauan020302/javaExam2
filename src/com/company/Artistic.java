package com.company;

public class Artistic extends Book {
    static int numOfArtistic;
    static String allInfo;

    public Artistic(){}

    public Artistic(int id, String author, String name, int year) {
        super(id, author, name, year);
        numOfArtistic++;
        allInfo = allInfo + "\n " + id + " " + author + " " + name + " " + year;

    }

    @Override
    public String toString() {
        return "Artistic Book - " + numOfArtistic;
    }

    @Override
    public void addBook(int id, String author, String name, int year) {
        super.addBook(id, author, name, year);
        numOfArtistic++;
    }

    public static void show() {
        System.out.println(allInfo);
    }

    public static void showAll(){
        System.out.println("Artistic Book \n" + allInfo + " count " + numOfArtistic);
    }

}
