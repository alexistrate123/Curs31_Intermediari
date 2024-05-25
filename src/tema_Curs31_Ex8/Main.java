package tema_Curs31_Ex8;

public class Main {
    public static void main(String[] args) {

        Student John = new Student("John", 22);

        John.call("0756987567");

        System.out.println("Numarul de telefon apelat de John este: " + John.telephoneNumber);

    }
}
