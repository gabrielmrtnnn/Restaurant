package restaurant;

import java.util.ArrayList;

import main.Food;

public class Menu {
    private String name;
    private ArrayList<Food> foods = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
        this.foods = new ArrayList<>();
    }

    public void add(Food food) {
        foods.add(food);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }
}
