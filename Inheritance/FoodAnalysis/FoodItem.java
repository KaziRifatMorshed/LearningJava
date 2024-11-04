package Inheritance.FoodAnalysis;

public class FoodItem {
    private final int CALORIES_PER_GRAM = 9;
    private int fatGram;
    private int servings;

    public FoodItem(int a, int b) {
        fatGram = a;
        servings = b;
    }
    private int calories(){
        return fatGram * CALORIES_PER_GRAM;
    }
    public int caloriesPerServing(){
        return (calories() / servings);
    }
}
