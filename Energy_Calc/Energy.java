import java.text.DecimalFormat;

public class Energy {
    public static void main(String []args) {
        DecimalFormat df = new DecimalFormat("0.00");
        KineticEnergy kineticEnergy1 = new KineticEnergy (100.21, 8.53);
        KineticEnergy kineticEnergy2 = new KineticEnergy (90.56, 10.25);
        PotentialEnergy potentialEnergy1 = new PotentialEnergy (120.5, 45);
        System.out.println("Kinetic Energy #1:\n" + kineticEnergy1.toString() + "\n");
        System.out.println("Kinetic Energy #2:\n" + kineticEnergy2.toString() + "\n");

        int comparison = kineticEnergy1.compareTo(kineticEnergy2);
        if (comparison > 0) {
            System.out.println("Kinetic Energy #1 has the largest momentum of " + kineticEnergy1.calculateMomentum() + " newtons-second\n");
        } else if (comparison < 0) {
            System.out.println("Kinetic Energy #2 has the largest momentum of " + kineticEnergy2.calculateMomentum() + " newtons-second\n");
        } else {
            System.out.println("Both Kinetic Energies have the same momentum of " + kineticEnergy2.calculateMomentum() + " newtons-second");
        }

        System.out.println("Potential Energy #1:\n" + potentialEnergy1.toString());
    }
}
