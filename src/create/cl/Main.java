package create.cl;

public class Main {
    public static void main(String[] args) {
        Person sasha = new Person();
        sasha.Say("Саша");
        System.out.println(sasha.height);

        Person vlad = new Person(150, "Худой");
        System.out.println(vlad.height);

        Person dima = new Person(222, "Тощий");
        System.out.println("\'Определяем что " + dima.height + " " + dima.opisanie + "\'");
        System.out.println("");

        Studens vasa = new Studens(175, "Жирабасы", 5);
        vasa.tell();
    }
}
