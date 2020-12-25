package com.company;

public class Technical extends Book {
    boolean haveComp;
    static int numOfTech;
    static String allInfo;
    public Technical(){}

    public Technical(int id, String author, String name, int year, boolean haveComp) {
        super(id, author, name, year);
        this.haveComp = haveComp;
        numOfTech++;
        allInfo = allInfo + "\n " + id + " " +  author + " " + name + " " + year;
    }

    public String toString() {
        return "Technical Book - " + numOfTech;
    }

    public static void show(){
        System.out.println(allInfo);
    }

    public static void showAll(){
        System.out.println("Technical Book \n" + allInfo + "\n count " + numOfTech);
    }

}
