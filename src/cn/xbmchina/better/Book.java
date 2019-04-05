package cn.xbmchina.better;

public class Book {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;


    private String title;
    private int priceCode;

    public Book() {
    }

    public Book(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }


    //1.提取统计数量的方法
    public double getCharge(int daysRented) {
        double result = 0;
        switch (getPriceCode()) {
            case Book.REGULAR:
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented - 2) * 1.5;
                }
                break;
            case Book.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Book.CHILDRENS:
                result += 1.5;
                if (daysRented > 3) {
                    result += (daysRented - 3) * 1.5;
                }
                break;
        }
        return result;
    }



    //1.提取计算会员积分的方法
    public int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == Book.NEW_RELEASE) && daysRented > 1) {
            return 2;
        }
        return 1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
