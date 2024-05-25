package exercitiul1;

public class Car {

    String marca;
    String model;
    int an;
    boolean on;

    public Car(String marca, String model, int an) {
        this.marca = marca;
        this.model = model;
        this.an = an;
    }

    public void startEngine() {
        if (on) {
            System.out.println("Masina este deja pornita.");
        } else {
            System.out.println("Masina a pornit");
            on = true;
        }
    }

    public void stopEngine() {
        if (on) {
            System.out.println("Masina s-a oprit");
            on = false;

        } else {
            System.out.println("Masina e deja oprita.");
        }
    }
}
