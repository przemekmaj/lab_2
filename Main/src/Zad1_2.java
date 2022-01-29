public class Zad1_2 {
    public static void main(String[] args) {
        int[] tablica = {2,3,4,1,6};
        double[] tablica2 = {2,3,4,1,6};
        String[] tablica3 = new String[5];
        tablica3[0] = "dwa";
        tablica3[1] = "trzy";
        tablica3[2] = "cztery";
        tablica3[3] = "jeden";
        tablica3[4] = "szeszcz";

        int i=0;
        while (i < 5) {
            System.out.println("Kolejna komórka to: " + tablica[i]);
            i++;
        }
        int j=0;
        while (j < 5) {
            System.out.println("Kolejna komórka to: " + tablica2[j]);
            j++;
        }
        int k=0;
        while (k < 5) {
            System.out.println("Kolejna komórka to: " + tablica3[k]);
            k++;
        }
    }
}
