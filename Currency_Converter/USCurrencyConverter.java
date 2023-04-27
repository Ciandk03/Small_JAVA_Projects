
import java.text.NumberFormat;
import java.util.Locale;
    public class USCurrencyConverter {

        private final double CANADIAN_RATE = 1.34, JAMAICA_RATE = 155.94, UK_RATE = .83, FRENCH_RATE = 6.07676;
        private double money;

        public USCurrencyConverter() {
            this.money = 0.0;
        }
        public double getMoney() {
            return money;
        }
        public void setMoney(double money) {
            this.money = money;
        }
        public String toString() {
            return "US Current rates:\n"
                    + "$" + this.CANADIAN_RATE + " Canadian\n"
                    + "$" + this.UK_RATE + " UK Pounds\n"
                    + "$" + this.FRENCH_RATE + " French Francs\n"
                    + "$" + this.JAMAICA_RATE + " Jamaican";
        }
        // Locale has a cross through it because the constructor "Locale" has depreciated since version 19 (no real issue)
        public String convertCurrency() {
            Locale USF = new Locale("en", "US");
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(USF);
            return currencyFormatter.format(getMoney()) + " US is:\n\n" +
                    ""
                    + currencyFormatter.format( getMoney() * this.CANADIAN_RATE) + " Canadian\n"
                    + currencyFormatter.format(getMoney() * this.UK_RATE) + " Pounds\n"
                    + currencyFormatter.format(getMoney() * this.FRENCH_RATE) + " French Francs\n"
                    + currencyFormatter.format( getMoney() * this.JAMAICA_RATE) + " Jamaican\n";
        }
    }

