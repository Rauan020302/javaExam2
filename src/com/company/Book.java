package com.company;

public class Book {
    int id;
    String author;
    String name;
    int year;
    static int numOfBook;
    public Book(){}

    public Book(int id, String author, String name, int year) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.year = year;
        numOfBook++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addBook(int id,String author,String name,int year){
        new Book(id,author,name,year);
        numOfBook++;
    }

    public void search(String name1){
        if(name1.length() == name.length()){
            System.out.println("name of Book - " + name + ", id - " + id + ", author - " + author);
        }else{
            System.out.println(false);
        }
    }
    public static void numOfBook(){
        System.out.println(numOfBook);
    }
}

