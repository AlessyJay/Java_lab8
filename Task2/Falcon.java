class Falcon extends Bird {
    public static String FeatherColour, Breed;
    Bird bird = new Bird();

    Falcon(String featherColour, String breed, String name, String age, String weight) {
        super(featherColour, breed);
        FeatherColour = featherColour;
        Breed = breed;
        Animal.name[1] = name;
        Animal.age[1] = age;
        Animal.weightFields[1] = weight;

        System.out.println(String.format("Falcon || Name: %s, Age: %s, Weight: %s, " +
                "Feather Colour: %s, Breed: %s", Animal.name[1], Animal.age[1],
                Animal.weightFields[1],
                FeatherColour, Breed));
        Animal.Eat();
        bird.Sleep();
        bird.Voice();
        Move();
        System.out.println("");
    }

    @Override
    public void Move() {
        System.out.println("Move: Falcon will fly.");
    }
}