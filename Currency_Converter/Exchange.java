
    import java.util.Scanner;

    public class Exchange {
        public static void main(String [] args) {
            Scanner scan = new Scanner(System.in);
            USCurrencyConverter exchange = new USCurrencyConverter();
            System.out.println(exchange.toString());
            System.out.println();
            System.out.print("Enter the amount of money:");
            exchange.setMoney(scan.nextDouble());
            System.out.println();
            System.out.println(exchange.convertCurrency());
        }
    }
