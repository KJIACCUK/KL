package create.cl;

public class Studens extends Person {
    int curses = 1;

    public Studens(){ }
    public Studens(int height, String opisanie, int curses){
        super(height,opisanie);
        this.curses = curses;
    }

    void tell(){
        System.out.println("Вася у нас " +super.height + " см и он относится конечно к группе " + super.opisanie);
    }
}
