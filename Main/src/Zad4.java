public class Zad4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0)
                continue;
            System.out.print(i + " ");
        }

        for (int i = 0; i <= 100; i++) {
            if (i == 22)
                break;
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for (int i = 0; i <= 100; i++) {
            if (i == 33)
                return;
            System.out.print(i + " ");
        }
    }
}
