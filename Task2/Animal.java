interface AnimalBehavior {
    void Sleep();
}

interface AnimalMove {
    default void Move() {
    }
}

interface AnimalName {
    public static void animalName(String name) {
        System.out.println(name);
    }
}

abstract class Animal implements AnimalBehavior, AnimalMove, AnimalName {
    public static String[] name = new String[3],
            age = new String[3], weightFields = new String[3];

    public static void Eat() {
        System.out.println("Eating: Nom Nom Nom!");
    }

    public abstract void Voice();
}