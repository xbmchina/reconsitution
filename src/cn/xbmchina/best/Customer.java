package cn.xbmchina.best;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList();

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    //添加租书信息
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    //生成订单
    public String generateOrder() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental : rentals) {
            result += "\t" + rental.getBook().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
        }
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + "frequent renter points";

        return result;
    }

    //获取购买总数
    private double getTotalCharge() {
        double result = 0;
        for (Rental rental : rentals) {
            result += rental.getCharge();
        }
        return result;
    }

    //统计积分
    private double getFrequentRenterPoints() {
        double result = 0;
        for (Rental rental : rentals) {
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
