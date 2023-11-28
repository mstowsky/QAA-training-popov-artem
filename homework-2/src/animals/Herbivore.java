package animals;

import food.Food;
import food.Plant;

public abstract class Herbivore extends Animal {

    public Herbivore(String name, int satietyLevel) {
        super(name, satietyLevel);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Plant) {
            setSatietyLevel(getSatietyLevel() + food.getFoodValue()); //увеличить степень насыщения
            System.out.println(getName() + " is eating plant food. Now its satiety is " + getSatietyLevel() + "."); //животное съело пищу, вывод степени насыщения
        } else {
            System.out.println(getName() + " doesn't want to eat a meat food."); //сообщение о том, что животное не ест мясную пищу
        }
    }
}
