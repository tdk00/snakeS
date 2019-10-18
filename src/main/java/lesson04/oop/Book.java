package lesson04.oop;

public class Book {
  String name;
  int pages;
  Author author;

  public Book(String name, int pages, Author author) {
    this.name = name;
    this.pages = pages;
    this.author = author;
  }
}
