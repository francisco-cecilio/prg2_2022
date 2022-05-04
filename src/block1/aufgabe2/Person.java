package block1.aufgabe2;

public class Person {
    //Attribute
    String nachname;
    String vorname;
    int alter;

    // Konsturkteure
    public Person(String nachname, String vorname, int alter){
        this.nachname = nachname;
        this.vorname = vorname;
        this.alter = alter;
    }

    public Person() {
        this("Peter", "Hans", 18);
    }

    // Methiden
    public void printInformation(){
        System.out.printf("%s, %s, %d", this.nachname, this.vorname, this.alter);
    }
}
