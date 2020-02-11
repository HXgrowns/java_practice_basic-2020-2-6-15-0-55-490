public class Eagle extends Bird {
    private String predation;

    public Eagle() {
    }

    public Eagle(int age, double weight, double flySpeed, String predation) {
        super(age, weight, flySpeed);
        this.predation = predation;
    }

    public void predated() {
        System.out.print("在饥肠辘辘之际捕食了一只兔子，");
    }

    @Override
    public String toString() {
        return String.format("一只%d岁的老鹰，体重%.2fKg，这只老鹰生活在兔子窝所以它只捕食兔子。", this.age, this.weight);
    }
}
