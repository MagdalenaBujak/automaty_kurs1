import java.util.Scanner;

public class CustomScanner {

  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imię: ");
        String name = scanner.nextLine();
        System.out.println("cześć " + name);

    }*/
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("podaj liczbę: ");
      int liczba = scanner.nextInt();
      int wynik = liczba * liczba;
      System.out.println("kwadrat liczby wynosi: " + wynik);

  }
}
