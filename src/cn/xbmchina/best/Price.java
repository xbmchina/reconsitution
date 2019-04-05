package cn.xbmchina.best;

public abstract class Price {

    abstract int getPriceCode();
    //1.提取统计数量的方法
    abstract double getCharge(int daysRented);

    //1.提取计算会员积分的方法
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}
