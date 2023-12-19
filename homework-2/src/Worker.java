import animals.Animal;
import animals.interfaces.Voiceable;
import food.Food;

public class Worker {
    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feed(Animal animal, Food food) {
        System.out.print(getName() + " tries to give " + food.getName() + " to " + animal.getName() + ". ");
        animal.eat(food);
    }

    public void getVoice(Voiceable voice) {
        System.out.println(voice.voice());
    }
}
