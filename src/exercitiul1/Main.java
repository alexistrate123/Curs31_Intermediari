package exercitiul1;

public class Main {
    //  Creeaza clasa Car cu urmatoarele campuri ( atribute ) String marca, String model, int an, boolean on, si
    // urmatoarele metode: printDetail(), startEngine()/stopEngine() = rezultate diferite in functie de starea interna a masinii;
    public static void main(String[] args) {
        Car Honda = new Car("Honda Civic", "N234", 2018);
        Honda.startEngine();
        System.out.println();
        Honda.stopEngine();
        Honda.stopEngine();
        Honda.startEngine();
        Honda.startEngine();


    }
}
