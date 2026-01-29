import java.util.*;

interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High Protein";
    }
}

class Meal<T extends MealPlan> {
    private T plan;

    Meal(T plan) {
        this.plan = plan;
    }

    T getPlan() {
        return plan;
    }
}

public class MealPlanGenerator {

    static <T extends MealPlan> void generatePlan(Meal<T> meal) {
        System.out.println("Generated Meal Plan: " + meal.getPlan().getMealType());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> vegan = new Meal<>(new VeganMeal());
        Meal<KetoMeal> keto = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> protein = new Meal<>(new HighProteinMeal());

        generatePlan(veg);
        generatePlan(vegan);
        generatePlan(keto);
        generatePlan(protein);
    }
}
