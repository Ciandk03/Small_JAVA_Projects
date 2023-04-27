//This is a child class of Food
public class Fruits extends Food{

    // TODO Auto-generated constructor stub


    //private field- fleshyOrDry: boolean
    private String fleshyOrDry;
    //-------------------------------------------------------------------
    //  Create a constructor for the Fruit class with the specified data.
    //  Includes initialization of the parent class.
    //-------------------------------------------------------------------
    public Fruits(double weight, double costPerPound, String name, String fleshyOrDry) {
        super(weight, costPerPound, name);
        this.fleshyOrDry = fleshyOrDry;
    }
    //------------------------------------------------------------------------
    //  Write a toString method to return a string summary of this Fruit class.
    //------------------------------------------'------------------------------
    public String toString() {
        return super.toString() + "\nFleshy or dry: " + fleshyOrDry;
    }
}
