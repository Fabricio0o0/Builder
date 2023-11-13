package www.Builder;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal prepareNonVegMeal() { // Correção no nome do retorno (meio de "meal" para "Meal")
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
