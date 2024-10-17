package org.howard.edu.lsp.midterm.question1;

public class Book {
    // Attributes
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    // Constructor
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // Overriding equals() method to compare by ISBN and author
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }

    // Overriding toString() method to provide meaningful output
    @Override
    public String toString() {
        return "Title: " + title + 
               ", Author: " + author + 
               ", ISBN: " + ISBN + 
               ", Year Published: " + yearPublished;
    }
}
