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
}
