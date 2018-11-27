package ZhiFeng;

public class Main {

    public static void main(String[] args) {
	    Sandwich reuben = new Sandwich();
	    Sandwich bec = new Sandwich();
	    Salad waldorf = new Salad();
	    Salad ceaser =new Salda();
	    Drink icedTea = new Drink();
	    Drink smoothie = new Drink();

	    Trio trio1 = new Trio(reuben, waldorf, icedTea);
	    Trio trio2 = new Trio(bec, ceaser, smoothie);
	    trio trio3 = new Trio(bec, caeser, icedTea);

	    System.out.println(trio.getName()+"price: " + trio1.getPrice());
        System.out.println(trio.getName()+"price: " + trio2.getPrice());
        System.out.println(trio.getName()+"price: " + trio3.getPrice());
    }
}
