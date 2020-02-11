public class Bird extends Animal {
    public double flySpeed;

    public Bird() {
    }

    public Bird(int age, double weight, double flySpeed) {
        super(age, weight);
        this.flySpeed = flySpeed;
    }

    public void fly() {
        System.out.print("某天它先翱翔天空，");
    }
}
