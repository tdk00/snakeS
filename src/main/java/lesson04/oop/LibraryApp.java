package lesson04.oop;

public class LibraryApp {
  public static void main(String[] args) {
    Author author = new Author("John");
    Book book1 = new Book("Java", 400, author);
    Book book2 = new Book("Scala", 800, author);
    Book book3 = new Book("Python", 800, author);
  }
}
