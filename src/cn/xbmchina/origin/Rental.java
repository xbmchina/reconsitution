package cn.xbmchina.origin;

public class Rental {

     private Book book;
     private int daysRented;

    public Rental() {
    }

    public Rental(Book book, int daysRented) {
        this.book = book;
        this.daysRented = daysRented;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }
}
