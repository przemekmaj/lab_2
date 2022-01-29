public class Main {
    public static void main(String[] args) {
        int liczba=1000;
        do{
            liczba--;
            System.out.println(liczba);
            if(liczba%78==0) System.out.println("Liczba "+liczba+" jest podzielna przez 78");
        }
        while(liczba!=0);
        //nr indeksu 58178
    }
}

