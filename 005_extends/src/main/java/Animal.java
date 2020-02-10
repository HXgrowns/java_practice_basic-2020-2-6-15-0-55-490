public class Animal {
    private int age;
    private double weight;

    public Animal() {
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public void eatFood() {
        System.out.print("然后饱餐一顿，");
    }

    public void sleep() {
        System.out.println("心满意足之后就睡觉了。");
    }
}
