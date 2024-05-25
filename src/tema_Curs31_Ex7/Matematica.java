package tema_Curs31_Ex7;

import java.util.Scanner;

public class Matematica {

    public double[] introducereNumere() {
        Scanner sc = new Scanner(System.in);
        double[] numere = new double[3];

        System.out.println("Introduceti cele trei numere:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Numarul " + (i + 1) + ": ");
            numere[i] = sc.nextDouble();
        }

        return numere;
    }

    public void calculSiAfisareMedie(double[] numere) {
        double suma = 0;

        for (double numar : numere) {
            suma += numar;
        }

        double media = suma / numere.length;

        System.out.println("Media numerelor este: " + media);
    }
}
