package food;

public abstract class Food {
    private final String name;
    private final int foodValue;

    public Food(String name, int foodValue) {
        this.name = name;
        this.foodValue = foodValue;
    }

    public String getName() {
        return name;
    }

    public int getFoodValue() {
        return foodValue;
    }
}
