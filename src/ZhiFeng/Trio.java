package ZhiFeng;

public class Trio implements MenuItem{

    private Sandwich Sandwich;
    private Salad Salad;
    private Drink Drink;

    public Trio(Sandwich Sandwich, Salad Salad, Drink Drink){
        this.Sandwich = Sandwich;
        this.Salad = Salad;
        this.Drink = Drink;
    }

    public String getName(){
        return this.Sandwich.getName() + "/" + this.Salad.getName() + "/" + this.Drink.getName();
    }

    public double getPrice(){
        double sandwichPrice = Sandwich.getPrice();
        double saladPrice = Salad.getPrice();
        double drinkPrice = Drink.getPrice();

        return sandwichPrice + saladPrice + drinkPrice;
    }
}
