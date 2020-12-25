package com.company;

public class Legal extends Book {
    static int numOfLegal;
    static String allInfo;
    public  Legal(){}

    public Legal(int id, String author, String name, int year) {
        super(id, author, name, year);
        numOfLegal++;
        allInfo = allInfo + "\n " + id + " " +  author + " " + name + " " + year;

    }

    @Override
    public String toString() {
        return "Legal Book - " + numOfLegal;
    }

    public static void show(){
        System.out.println( allInfo);

    }
    public static void showAll(){
        System.out.println("Legal Book \n" + allInfo + "\n count - " + numOfLegal);
    }

}
