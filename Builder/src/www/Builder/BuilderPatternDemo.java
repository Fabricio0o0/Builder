package www.Builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder(); // Correção no nome da variável

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost()); // Adicionei ponto e vírgula

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal(); // Correção no nome do método
        System.out.println("\n\nNon-Veg Meal "); // Correção nas barras invertidas
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost()); // Adicionei ponto e vírgula
    }
}
