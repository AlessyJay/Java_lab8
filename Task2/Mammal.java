public class Mammal extends Animal {
    private String breed, species, legs;

    Mammal(String breed, String species, String legs) {
        this.breed = breed;
        this.species = species;
        this.legs = legs;
    }

    public Mammal() {

    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getLegs() {
        return this.legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public void Voice() {
        // TODO Auto-generated method stub
        System.out.println("Voice: Bark Bark!!");
    }

    @Override
    public void Sleep() {

    }
}