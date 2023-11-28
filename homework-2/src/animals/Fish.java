package animals;

public class Fish extends Carnivorous implements Swimable {

    public Fish(String name, int satietyLevel) {
        super(name, satietyLevel);
    }

    @Override
    public String toString() {
        return "The fish " + getName() + " is carnivorous animal. Its satiety level is " + getSatietyLevel() + ".";
    }

    @Override
    public void swim() {
        System.out.println("This fish can swim.");
    }

}
