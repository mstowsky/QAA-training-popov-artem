public class Kotik {
    private static int kotikCount = 0;
    private String name;
    private int weight;
    private int isHungry;

    // параметризированный конструктор объекта
    public Kotik(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.isHungry = (int) (Math.random() * 10); // степень голодности устанавливается случайным числом от 0 до 10
        kotikCount += 1;

        System.out.println("We have new cat, his name is " + this.name + " and he weights " + this.weight + " kg!");
    }

    private void wantToEat(String cantDoAction) { // вывод сообщения о голодном коте
        System.out.println(name + " is hungry! He can't " + cantDoAction + "!");
    }

    public void play() {
        if (isHungry > 0) {
            System.out.println(name + " is playing with toys.");
            isHungry -= 1;
        } else wantToEat("play");
    }

    public void sleep() {
        if (isHungry > 0) {
            System.out.println(name + " is sleeping now.");
            isHungry -= 1;
        } else wantToEat("sleep");
    }

    public void chaseMouse() {
        if (isHungry > 0) {
            System.out.println(name + " is chasing the mouse.");
            isHungry -= 1;
        } else wantToEat("chase mouse");
    }

    public void scratchSofa() {
        if (isHungry > 0) {
            System.out.println(name + " is scratching the sofa.");
            isHungry -= 1;
        } else {
            wantToEat("scratch");
        }
    }

    public void eat() {
        System.out.println(name + " is eating.");
        isHungry += 1 + (int) (Math.random() * 5); // покормить кота на 1-5 единиц
    }

    public void liveAnotherDay() {
        for (int hour = 0; hour < 24; hour++) {
            int caseRandom = 1 + (int) (Math.random() * 5);
            System.out.print("Hour " + hour + ": ");
            switch (caseRandom) {
                case 1:
                    play();
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    chaseMouse();
                    break;
                case 4:
                    scratchSofa();
                    break;
                case 5:
                    eat();
                    break;

            }
        }
    }
}
