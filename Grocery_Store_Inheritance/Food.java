import java.text.NumberFormat;
import java.util.Locale;

public class Food {
    //Private fields- weight: double, costPerPound:double, name:String
    protected double weight;
    protected double costPerPound;
    protected String name;
    Locale locale = new Locale("en", "US");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

    //------------------------------------------
    //  Create a constructor for the Food class.
    //------------------------------------------
    public Food(double weight, double costPerPound, String name){
        this.weight = weight;
        this.costPerPound = costPerPound;
        this.name = name;
    }
    //------------------------------------------------------------------------
    //  Write a cost method to calculate and return the cost of the food item.
    //------------------------------------------------------------------------
    public double cost() {
        return weight * costPerPound;
    }
    //------------------------------------------------------------------------
    //  Write a toString method to return a string summary of this Food class.
    //------------------------------------------------------------------------
    public String toString() {
        return "Name: " + name +"\nCost/lb: " + costPerPound + "\nWeight: " + weight + " lbs" + "\nCost: " + currencyFormatter.format(cost());
    }
}
