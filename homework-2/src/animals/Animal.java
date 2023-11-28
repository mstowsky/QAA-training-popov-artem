package animals;

import food.Food;

public abstract class Animal {

    private final String name;
    private int satietyLevel;

    public Animal(String name, int satietyLevel) {
        this.name = name;
        this.satietyLevel = satietyLevel;
    }

    public String getName() {
        return name;
    }

    public int getSatietyLevel() {
        return satietyLevel;
    }

    public void setSatietyLevel(int satietyLevel) {
        this.satietyLevel = satietyLevel;
    }

    public abstract void eat(Food food);
}
