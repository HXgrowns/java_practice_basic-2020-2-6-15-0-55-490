public class Bird extends Animal {
    private double flySpeed;

    public Bird() {
    }

    public Bird(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public Bird(int age, double weight) {
        super(age, weight);
    }

    public void fly() {
        System.out.print("某天它先翱翔天空，");
    }
}
