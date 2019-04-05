package cn.xbmchina.best;

public class Book {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;


    private String title;
    private Price _price;

    public Book() {
    }

    public Book(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    //1.提取统计数量的方法
    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
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
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg){
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
                default:
                    throw new IllegalArgumentException("Incorrect Price code");
        }
    }
}
