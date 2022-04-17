class Dog extends Mammal {
    public static String Breed, Species, Legs;
    Mammal mam = new Mammal();

    Dog(String breed, String species, String legs, String name, String age, String weight) {
        super(breed, species, legs);
        Breed = breed;
        Species = species;
        Legs = legs;
        Animal.name[0] = name;
        Animal.age[0] = age;
        Animal.weightFields[0] = weight;

        System.out.println(String.format("Dog || Name: %s, Age: %s, Weight: %s, " +
                "Breed: %s, Species: %s, Legs: %s", Animal.name[0],
                Animal.age[0], Animal.weightFields[0],
                Breed, Species, Legs));
        Animal.Eat();
        mam.Sleep();
        mam.Voice();
        Move();
        System.out.println("");
    }

    @Override
    public void Move() {
        System.out.println("Move: Dogs will walk.");
    }
}
