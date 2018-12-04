package ZhiFeng;

public class Main {

    public static void main(String[] args) {
	    Sandwich reuben = new Sandwich(5.75,"reuben");
	    Sandwich bec = new Sandwich(2.00,"BEC");
	    Salad waldorf = new Salad(7.25,"Waldorf");
	    Salad ceaser = new Salad(4.50,"Ceaser");
	    Drink icedTea = new Drink(1.50,"Iced Tea");
	    Drink smoothie = new Drink(5.50,"Smoothie");

	    Trio trio1 = new Trio(reuben, waldorf, icedTea);
	    Trio trio2 = new Trio(bec, ceaser, smoothie);
	    Trio trio3 = new Trio(bec, ceaser, icedTea);

	    System.out.println(trio1.getName()+"price: " + trio1.getPrice());
        System.out.println(trio2.getName()+"price: " + trio2.getPrice());
        System.out.println(trio3.getName()+"price: " + trio3.getPrice());
    }
}
