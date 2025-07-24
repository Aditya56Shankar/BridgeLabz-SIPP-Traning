interface MealPlan {
    void prepare();
}

class VegetarianMeal implements MealPlan {
    public void prepare() { System.out.println("Preparing vegetarian meal..."); }
}

class Meal<T extends MealPlan> {
    private T plan;
    Meal(T plan) { this.plan = plan; }
    void generatePlan() { plan.prepare(); }
}

public class MealPlanGenerator {
    public static <T extends MealPlan> void generateMeal(T plan) {
        plan.prepare();
    }

    public static void main(String[] args) {
        VegetarianMeal meal = new VegetarianMeal();
        generateMeal(meal);
    }
}