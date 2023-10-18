import model.Kotik;

public class Application {
    public static void main(String[] args) {
        System.out.println();
        Kotik cat1 = new Kotik("Barsik", 4.4, "meow");
        cat1.newCatHere();
        cat1.liveAnotherDay();

        System.out.println();

        Kotik cat2 = new Kotik();
        cat2.setName("Tom");
        cat2.setWeight(3.11);
        cat2.setMeow("me" + "ow");
        cat2.setIsHungry();
        cat2.newCatHere();
        cat2.liveAnotherDay();

        System.out.println();
        System.out.println(cat1.getName() + " says \"" + cat1.getMeow() + "\".");
        System.out.println(cat2.getName() + " says \"" + cat2.getMeow() + "\".");
        System.out.println("Do they speak the same word? Answer is " + cat1.getName().equals(cat2.getName()) + ".");

        System.out.println();
        System.out.println("Total cats here: " + Kotik.getCounter());
    }
}
