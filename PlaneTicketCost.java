
package CSCI_1302;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
    public class PlaneTicketCost {
        public static void main(String[] args) {
            int age, numpeople, counter;
            double singleTicket, totalTicket;
            final double TAX_RATE = 1.075;
            boolean INTERNATIONAL;
            float cost = 0;
            singleTicket = 250;
            INTERNATIONAL = true;
            NumberFormat nF = NumberFormat.getCurrencyInstance(Locale.US);
            String.format("%.2f", cost);
            Scanner scan = new Scanner(System.in);
            int num = 0;



            System.out.print("Enter the number of tickets needed:");
            numpeople = scan.nextInt();


            while(num != numpeople) {
                System.out.print("Person#" + (num + 1) + ": Enter your age:");
                age = scan.nextInt();
                num++;
                if (age >= 65 && INTERNATIONAL == true) {
                    cost = cost + (float) (cost + singleTicket) - 50;
                }
                else if (age <= 2) {
                    cost = cost + 0;
                }
                else {
                    cost = (float) (cost + singleTicket);
                }
            }

            float afterTax = (float) (cost * TAX_RATE);
            System.out.println("The total cost for the plane ticket(s) before tax = " + nF.format(cost));
            System.out.println("The total cost for the plane ticket(s) after tax = " + nF.format(afterTax));

            String m1, m2, m3;
            m1 = "The more you know, the more you realize you know nothing";
            m1 = m1.toUpperCase();
            m2 = m1.toLowerCase();
            m3 = m2 + ", " + m1;
            System.out.println(m3.replace('o', 'U'));

        }
    }

