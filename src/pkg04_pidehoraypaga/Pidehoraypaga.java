package pkg04_pidehoraypaga;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pidehoraypaga {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.printf("Introduzca horas trabajadas: ");
        int horas;
        try {
            horas = s.nextInt();
            System.out.printf("Horas: %d\n", horas);
        } catch (InputMismatchException e) {
            System.out.printf("ERROR: El valor introducido (%s), no es valido\n",
                    s.next());
            return;
        }
        
        System.out.printf("Introduzca paga x hora: ");
        int paga;
        try {
            paga = s.nextInt();
            System.out.printf("Paga x hora: %d\n", paga);
        } catch (InputMismatchException e) {
            System.out.printf("ERROR: El valor introducido (%s), no es valido\n",
                    s.next());
            return;
        }

        int pagaTotal = horas * paga;
        System.out.printf("La paga total es: %d\n", pagaTotal);

    }

}
