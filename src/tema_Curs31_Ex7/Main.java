package tema_Curs31_Ex7;
public class Main {
    public static void main(String[] args) {
       Matematica matematica = new Matematica();
       double[] numereIntroduse = matematica.introducereNumere();
       matematica.calculSiAfisareMedie(numereIntroduse);
    }
}

