import java.util.Scanner;

public class Zad3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.print("Podaj liczbę: ");
        int liczba = scan.nextInt();

        switch (liczba%2){
            case 0:
                System.out.println("Liczba jest przaysta!");
                break;
            default:
                System.out.println("Liczba nieparzysta!");
                break;
        }
        switch (liczba%7){
            case 0:
                System.out.println("Liczba podzielna przez 7!");
                break;
            default:
                System.out.println("Liczba niepodzielna przez 7!");
                break;
        }




    }
}
