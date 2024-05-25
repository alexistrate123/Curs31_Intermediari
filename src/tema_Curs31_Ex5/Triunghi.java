package tema_Curs31_Ex5;

public class Triunghi {
     double latura1;
     double latura2;
     double latura3;

    // Constructor fără parametrii
    public Triunghi() {
        // Valorile implicite pentru laturi pot fi schimbate la nevoie
        this.latura1 = 0;
        this.latura2 = 0;
        this.latura3 = 0;
    }

    // Metoda pentru setarea laturilor triunghiului
    public void setLaturi(double latura1, double latura2, double latura3) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
    }

    public double calculPerimetru() {
        return latura1 + latura2 + latura3;
    }


    public double calculArie() {
        double semiPerimetru = calculPerimetru() / 2;
        return Math.sqrt(semiPerimetru*(semiPerimetru - latura1) * (semiPerimetru - latura2) * (semiPerimetru - latura3));
    }

}
