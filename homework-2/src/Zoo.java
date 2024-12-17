import animals.carnivorous.*;
import animals.herbivore.*;
import animals.interfaces.*;
import food.Meat;
import food.Plant;

public class Zoo {
    public static void main (String[] args) {
        System.out.println();

        Lion lion1 = new Lion("Simba", (int) (Math.random() * 20)); //создать льва (плотоядное)
        System.out.println(lion1);
        Cow cow1 = new Cow("Varya", (int) (Math.random() * 20)); //создать корову (травоядное)
        System.out.println(cow1);
        Fish fish1 = new Fish("Nemo", (int) (Math.random() * 20)); //создать рыбу (плотоядное, не умеет говорить)
        System.out.println(fish1);
        Duck duck1 = new Duck("Jumbo", (int) (Math.random() * 20)); //создать утку (травоядное)
        System.out.println(duck1);
        Snake snake1 = new Snake("Kaa", (int) (Math.random() * 20)); //создать змею (плотоядное)
        System.out.println(snake1);
        FlyingSquirrel squirrel1 = new FlyingSquirrel("Scrat", (int) (Math.random() * 20)); //создать белку-летягу (травоядное, не умеет говорить)
        System.out.println(squirrel1);

        Meat meatFood = new Meat("rabbit", 10); //создать мясную пищу
        Plant plantFood = new Plant("apple", 5); //создать растительную пищу

        System.out.println();
        Worker worker1 = new Worker("Bill"); //создать работника
        worker1.feed(lion1, plantFood); //дать яблоко льву
        worker1.feed(lion1, meatFood); //дать кролика льву
        worker1.feed(cow1, plantFood); //дать яблоко корове
        worker1.feed(cow1, meatFood); //дать кролика корове
        System.out.println();
        worker1.getVoice(lion1);
        worker1.getVoice(cow1);
        //worker1.getVoice(fish1); //рыба не разговаривает, поэтому при компилляции ошибка "incompatible types: animals.Carnivorous.Fish cannot be converted to animals.interfaces.Voiceable"
        worker1.getVoice(duck1);
        worker1.getVoice(snake1);
        //worker1.getVoice(squirrel1); //белка не разговаривает, поэтому при компилляции ошибка "incompatible types: animals.Herbivore.Herbivore.FlyingSquirrel cannot be converted to animals.interfaces.Voiceable"

        System.out.println();
        //животное бегает
        lion1.run();
        squirrel1.run();

        System.out.println();
        //животное летает
        duck1.fly();
        squirrel1.fly();

        System.out.println();
        Swimable[] lake = new Swimable[]{duck1, fish1};
        for (int i = 0; i < lake.length; i++) {
            lake[i].swim();
        }
    }
}
