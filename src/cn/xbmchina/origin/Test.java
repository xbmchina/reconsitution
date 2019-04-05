package cn.xbmchina.origin;


public class Test {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Book book = new Book("Java入门到放弃",Book.NEW_RELEASE);
        Book book1 = new Book("python入门到放弃",Book.CHILDRENS);
        Book book2 = new Book("golang入门到放弃",Book.REGULAR);

        customer.addRental(new Rental(book,8));
        customer.addRental(new Rental(book1,4));
        customer.addRental(new Rental(book2,6));

        customer.setName("zero");
        System.out.println(customer.generateOrder());

    }
}
