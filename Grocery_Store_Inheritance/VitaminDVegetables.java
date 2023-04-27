//This is a child class of Vegetables
public class VitaminDVegetables extends Vegetables{

    // TODO Auto-generated constructor stub

    //private field- wildVegetable: boolean
    private boolean wildVegetable;
    //--------------------------------------------------------------------------------
    //  Create a constructor for the VitaminDVegetables class with the specified data.
    //  Includes initialization of the parent class.
    //-------------------------------------------------------------------------------
    public VitaminDVegetables(double weight, double costPerPound, String name, boolean growsUnderground, String color, boolean wildVegetable) {
        super(weight, costPerPound, name, growsUnderground, color);
        this.wildVegetable = wildVegetable;
    }
    //-------------------------------------------------------------------------------------
    //  Write a toString method to return a string summary of this VitaminDVegetables class.
    //-------------------------------------------------------------------------------------
    public String toString() {
        return super.toString() + "\nWild Vegetable: " + wildVegetable;
    }

}
