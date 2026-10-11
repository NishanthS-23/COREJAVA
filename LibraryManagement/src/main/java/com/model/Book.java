package com.model;

public class Book {
    private int id;
    private String title;
    private String author;
    private int pubYear;
    private int quantity;
    private double price;

    public Book() {}

    public Book(int id, String title, String author, int pubYear, int quantity, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.quantity = quantity;
        this.price = price;
    }

    public Book(String title, String author, int pubYear, int quantity, double price) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.quantity = quantity;
        this.price = price;
    }

    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public int getPubYear() { return pubYear; }
    public void setPubYear(int pubYear) { this.pubYear = pubYear; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}// Getters and Setters