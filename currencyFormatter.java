import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;
import java.util.Scanner;

class currencyFormatter {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        String us = u.format(payment);
        
        // India does not have a built-in Locale, so construct one where the language is en (english)
        NumberFormat i = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = i.format(payment);
        
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = c.format(payment);
        
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = f.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}