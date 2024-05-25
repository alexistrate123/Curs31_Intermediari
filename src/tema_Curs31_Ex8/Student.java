package tema_Curs31_Ex8;

public class Student {
    String name;
    int age;
    String telephoneNumber;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void call(String telephoneNumber) {
        //this.telephoneNumber = telephoneNumber;
        System.out.println("Studenul " + name + ", cu varsta de " + age + " de ani, a trimis un sms la numarul de " +
                "telefon: " + telephoneNumber);
    }
}

