public class Pizza {

    private int price;
    private boolean veg;

    private final int extraCheesePrice = 100;
    private final int extraToppingsPrice = 150;
    private final int backPackPrice = 20;

    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        this.price = veg ? 300 : 400;
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
        this.price += backPackPrice;
    }

    public void getBill() {
        StringBuilder bill = new StringBuilder();
        System.out.println("Pizza Base Price: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill.append("Extra Cheese: ").append(extraCheesePrice).append("\n");
        }
        if (isExtraToppingsAdded) {
            bill.append("Extra Toppings: ").append(extraToppingsPrice).append("\n");
        }
        if (isOptedForTakeAway) {
            bill.append("Takeaway Charge: ").append(backPackPrice).append("\n");
        }
        bill.append("Total Bill: ").append(this.price).append("\n");
        System.out.println(bill);
    }
}
