public class Grocery {
    //------------------------------------------------------------------
    //  Driver class for creating Grocery.
    //------------------------------------------------------------------
    public static void main(String[] args) {
        //Create an array of Food instance variables of size 5
        Food[] food = new Food[5];
        //Create an object of each type of class.
        food[0] = new Food(2.5, 1.20, "Spaghetti");
        food[1] = new Vegetables(2, 0.75, "Cucumber", false, "Green");
        food[2] = new VitaminDVegetables(1, 0.55, "Spinach", false, "Green", false);
        food[3] = new Meat(5, 1.50, "Chicken", "Poultry");
        food[4] = new Fruits(4, 1.75, "Apple", "Fleshy");

        Locale locale = new Locale("en", "US");
        double tC = 0;
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        //Initialize them with values, and assign them to the array.

		/* Use a for loop to invoke the toString method for each Food element in the array. Call
		   the appropriate method to calculate the cost of each element in the Food array
		*/
        for(Food per:food) {
            System.out.println(per.toString()+"\n");
        }

        //Output the total cost of all the Food elements
        for(int i=0; i<=food.length-1; i++) {
            tC += food[i].weight *food[i].costPerPound;
        }
        System.out.println("Grocery subtotal: " + currencyFormatter.format(tC));
    }

}
