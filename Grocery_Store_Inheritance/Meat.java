//This is a child class of Food
public class Meat extends Food{
    // a

    //private field- meatType (Poultry or Red Meat): String.
    private  String meatType;
    //-------------------------------------------------------------------
    //  Create a constructor for the Meat class with the specified data.
    //  Includes initialization of the parent class.
    //-------------------------------------------------------------------
    public Meat(double weight, double costPerPound, String name, String meatType) {
        super(weight, costPerPound, name);
        this.meatType = meatType;
    }
    //------------------------------------------------------------------------
    //  Write a toString method to return a string summary of this Meat class.
    //------------------------------------------------------------------------
    public String toString() {
        return super.toString() + "\nMeat type: " + meatType;
    }
}
