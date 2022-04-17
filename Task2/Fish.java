class Fish extends Animal {
    private String oxygen;

    Fish(String oxygen) {
        this.oxygen = oxygen;
    }

    Fish() {

    }

    public String getOxygen() {
        return this.oxygen;
    }

    public void setOxygen(String oxygen) {
        this.oxygen = oxygen;
    }

    @Override
    public void Voice() {
        // TODO Auto-generated method stub
        System.out.println("Voice: Bladder Bladder!");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleeping: zzzzzz");
    }
}