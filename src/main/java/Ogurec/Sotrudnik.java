package Ogurec;

public class Sotrudnik {
    private String name;
    private String gmail;
    private String doljnost;
    private String nunumber;
    private int zarplata$;
    private int age;

    public Sotrudnik(String name, String gmail, String doljnost, String nunumber, int age, int zarplata$) {
        this.name = name;
        this.gmail = gmail;
        this.doljnost = doljnost;
        this.nunumber = nunumber;
        this.zarplata$ = zarplata$;
        this.age = age;
    }
    public String MString() {
        return (
                name+ "\n-"
                +gmail+ "\n-"
                +doljnost+ "\n-"
                +nunumber+ "\n-"
                +zarplata$+ "\n-"
                +age);

    }
    public int get_Age() {return age; }
}
