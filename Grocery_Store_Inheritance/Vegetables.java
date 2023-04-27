//This is a child class of Food
public class Vegetables extends Food{


    // TODO Auto-generated constructor stub

    //Private field- growsUnderground: boolean, color: String
    protected boolean growsUnderground;
    protected String color;
    //-------------------------------------------------------------------------
    //  Create a constructor for the Vegetables class with the specified data.
    //  Includes initialization of the parent class.
    //-------------------------------------------------------------------------
    public Vegetables(double weight, double costPerPound, String name, boolean growsUnderground, String color) {
        super(weight, costPerPound, name);
        this.growsUnderground = growsUnderground;
        this.color = color;
    }
    //-------------------------------------------------------------------------------
    //  Write a toString method to return a string summary of this Vegetables class.
    //-------------------------------------------------------------------------------
    public String toString() {
        return super.toString() + "\nGrows Underground: " + growsUnderground + "\nColor: " +color;
    }
}
