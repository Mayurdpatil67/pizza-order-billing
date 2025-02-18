public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(true);
        DeluxPizza dp = new DeluxPizza(true);
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeAway();
        dp.takeAway();
        //basePizza.getBill();
        dp.getBill();
    }
}
