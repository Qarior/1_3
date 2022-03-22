import java.util.Scanner;
import java.util.Locale;
class Main
  {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      scanner.useLocale(Locale.US);
      System.out.println("Podaj podstawę potęgi:");
      double first = scanner.nextDouble();
      System.out.println("Podaj wykładnik potęgi:");
      double second = scanner.nextDouble();
      double potega = Math.pow(first,second); 
      //Math.pow(first,second);
      //System.out.println("Wynik obliczenia:" + Math.pow);
      System.out.println("Wynik działania: " + potega);
    }
  }