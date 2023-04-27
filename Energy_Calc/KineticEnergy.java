import java.text.DecimalFormat;

public class KineticEnergy implements EnergyInterface{
    private double mass;
    private double velocity;
    private DecimalFormat df = new DecimalFormat("0.00");

    public KineticEnergy(double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;
    }
    public double calculateEnergy() {
        return 0.5 * mass * velocity * velocity;
    }
    public int calculateMomentum() {
        return (int) (mass * velocity);
    }
    public int compareTo(KineticEnergy other) {
        int momentum1 = calculateMomentum();
        int momentum2 = other.calculateMomentum();
        if (momentum1 > momentum2) {
            return 1;
        } else if (momentum1 < momentum2) {
            return -1;
        } else {
            return 0;
        }
    }
    public String toString() {
        return "Energy: " + df.format(calculateEnergy()) + " Joules" + "\nMass: " + df.format(mass) + " kilograms" + "\nVelocity: " + df.format(velocity) + " meters/second" + "\nMomentum: " + calculateMomentum() + " newtons-second";
    }
}