package tema_Curs31_Ex6;

public class Triunghi2 {
    double latura1;
    double latura2;
    double latura3;

    // Constructor cu 3 parametrii


    public Triunghi2(double latura1, double latura2, double latura3) {
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
