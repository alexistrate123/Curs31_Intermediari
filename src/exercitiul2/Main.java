package exercitiul2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Creeaza clasa Robot cu urmatoarele campuri: String name, int atackPower, String material,
    // metoda atack() se va folosi de campurile obiectului pentru a afisa un mesaj corespunzator:
    // adauga intr-o lista 5 roboti ale caror detalii vor fi introduse de la tastatura:
    // fa ca toti robotii din lista ta sa atace:
    public static void main(String[] args) {

        ArrayList<Robot> Cei5Fantastici = new ArrayList<>();
        Scanner rob = new Scanner(System.in);
        Scanner rob1 = new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Introduceti numele robotului: ");
            String name = rob.next();

            System.out.println("Introduceti puterea atactului: ");
            int atackPower = rob1.nextInt();

            System.out.println("Adaugati materialul robotului: ");
            String material = rob.next();

            Cei5Fantastici.add(new Robot(name, atackPower, material ));
        }

        for (Robot element:Cei5Fantastici) {
            element.atack();
        }

    }
}
