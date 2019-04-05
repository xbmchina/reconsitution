package cn.xbmchina.origin;

import java.util.ArrayList;
import java.util.Enumeration;
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

        double total = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for "+getName()+"\n";
        for (Rental rental : rentals) {
            double thisAmount = 0;
            switch (rental.getBook().getPriceCode()){
                case Book.REGULAR:
                    thisAmount += 2;
                    if (rental.getDaysRented() > 2){
                        thisAmount += (rental.getDaysRented() - 2) *1.5;
                    }
                    break;
                case Book.NEW_RELEASE:
                        thisAmount += rental.getDaysRented()*3;
                    break;
                case Book.CHILDRENS:
                    thisAmount += 1.5;
                    if (rental.getDaysRented() > 3){
                        thisAmount += (rental.getDaysRented() - 3) *1.5;
                    }
                    break;
            }

            frequentRenterPoints++;
            if ((rental.getBook().getPriceCode() == Book.NEW_RELEASE) && rental.getDaysRented() >1){
                frequentRenterPoints++;
            }

            if ((rental.getBook().getPriceCode() == Book.NEW_RELEASE) && rental.getDaysRented() >1) {
                frequentRenterPoints++;
            }

            result += "\t"+rental.getBook().getTitle() + "\t"+String.valueOf(thisAmount)+"\n";
            total +=thisAmount;

        }

        result += "Amount owed is "+ String.valueOf(total) +"\n";
        result += "You earned "+ String.valueOf(frequentRenterPoints) +"frequent renter points";

        return result;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
