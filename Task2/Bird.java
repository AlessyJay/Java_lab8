class Bird extends Animal {
    private String featherColour, breed;

    Bird(String featherColour, String breed) {
        this.featherColour = featherColour;
        this.breed = breed;
    }

    Bird() {
        super();
    }

    public String getFeatherColour() {
        return this.featherColour;
    }

    public void setFeatherColour(String featherColour) {
        this.featherColour = featherColour;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void Voice() {
        // TODO Auto-generated method stub
        System.out.println("Voice: Jib Jib Jib!");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleeping: zzzzzz");
    }
}
