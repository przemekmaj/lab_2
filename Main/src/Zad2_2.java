import java.util.Scanner;

public class Zad2_2 {
    public static void main(String[] args) {
        int[] tablica = new int[5];

        Scanner scan = new Scanner(System.in);

        for(int i=0;i<=4;i++) {
            System.out.println("Podaj "+(i+1)+" element tablicy");
            tablica[i] = scan.nextInt();
        }
        for (int x : tablica) {
            System.out.println(x);
        }


    }
}
