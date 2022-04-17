class Tuna extends Fish {
    public static String Oxygen;
    Fish fish = new Fish();

    Tuna(String oxygen, String name, String age, String weight) {
        super(oxygen);
        Oxygen = oxygen;
        Animal.name[2] = name;
        Animal.age[2] = age;
        Animal.weightFields[2] = weight;

        System.out.println(String.format("Tuna || Name: %s, Age: %s," +
                "Weight: %s, Oxygen: %s",
                Animal.name[2], Animal.age[2], Animal.weightFields[2], Oxygen));
        Animal.Eat();
        fish.Sleep();
        fish.Voice();
        Move();
        System.out.println("");
    }

    @Override
    public void Move() {
        System.out.println("Move: Tuna will swim.");
    }
}