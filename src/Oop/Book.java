package Oop;

public class Book {
    public String name  ;
    public int pageNumber;
    public String author;
    public String publisher;
    public double price ;

    public Book(String name, int pageNumber, String author, String publisher, double price) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public Book() {
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name="Şeker Portakalı";
        book1.author="Jose Mauro de Vasconcelos";
        book1.pageNumber= 180 ;
        book1.price=25 ;
        book1.publisher="Can Yayınları";

        Book book2 = new Book("Kiraz Mevsimi",145,"Mirac","abc yayınları",75);

    }
}