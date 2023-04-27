import java.text.DecimalFormat;

public class PotentialEnergy implements EnergyInterface{
    private double mass;
    private double height;
    private DecimalFormat df = new DecimalFormat("0.00");

    public PotentialEnergy(double mass, int height) {
        this.mass = mass;
        this.height = height;
    }

    public double calculateEnergy() {
        return mass * EnergyInterface.GRAVITATIONAL_ACCELERATION * height;
    }

    public String toString(){
        return "Mass: " + df.format(mass) + " kilograms" + "\nHeight:  " + df.format(height)+ " Meters\n" + "Energy: " + df.format(calculateEnergy()) + " Joules";
    }

}


