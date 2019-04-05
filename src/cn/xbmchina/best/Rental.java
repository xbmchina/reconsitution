package cn.xbmchina.best;

public class Rental {

    private Book book;
    private int daysRented;

    public Rental() {
    }

    public Rental(Book book, int daysRented) {
        this.book = book;
        this.daysRented = daysRented;
    }

    //1.提取统计数量的方法
    public double getCharge() {
        return book.getCharge(daysRented);
    }

    //1.提取计算会员积分的方法
    public int getFrequentRenterPoints() {
        return book.getFrequentRenterPoints(daysRented);
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
