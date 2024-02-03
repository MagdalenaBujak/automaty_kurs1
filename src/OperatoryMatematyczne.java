public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int liczba1 = 4;
        int liczba2 = 6;
        float liczba3 = 6;

        liczba1+=liczba2;
        int addition = liczba1 + liczba2;
        int subtraction = liczba2 - liczba1;
        int multiplication = liczba1 * liczba2;
        float division = liczba1 / liczba3;
        int mod = liczba2%liczba1;


        System.out.println("dodawanie " + addition);
        System.out.println("odejmowanie " + subtraction);
        System.out.println("mnożenie " + multiplication);
        System.out.println("dzielenie " + division);
        System.out.println("reszta z dzielenia " + mod);
    }
}
