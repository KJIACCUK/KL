package create.cl;

public class Person {

    public int height = 15;
    public String opisanie = "Толстый";

    public Person(){ }
    public Person(int height, String opisanie){
        this.height = height;
        this.opisanie = opisanie;
    }

    public void Say(String s){
        System.out.println("Привет " + s);
    }
}
