package exercitiul2;

import java.sql.SQLOutput;

public class Robot {
    String name;
    int atackPower;
    String material;

    public Robot(String name, int atackPower, String material) {
        this.name = name;
        this.atackPower = atackPower;
        this.material = material;
    }

    public void atack() {
        System.out.println("Robotul " + name + " ataca.");
    }

}
