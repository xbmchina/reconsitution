package cn.xbmchina.best;

public class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Book.CHILDRENS;
    }


    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented >3) {
            result += (daysRented - 3) * 1.5;
        }
        return  result;
    }
}
