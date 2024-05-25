package tema_Curs31_Ex5;

public class Main {
    public static void main(String[] args) {

        Triunghi triunghi = new Triunghi();
        triunghi.setLaturi(6, 8, 7);

        System.out.println("Perimetru: " + triunghi.calculPerimetru());
        System.out.printf("Arie: %.2f", triunghi.calculArie());
    }
}
