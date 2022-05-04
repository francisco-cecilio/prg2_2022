package block1.aufgabe2;

public class Angestellter extends Person {
// Attribute
    int mitarbeiterID;

    // Konstrukteure
    public Angestellter(String nachname, String vorname, int alter, int mitarbeiterID){
        this.nachname = nachname;
        this.vorname = vorname;
        this.alter = alter;
        this.mitarbeiterID = mitarbeiterID;
    }

    // Methoden
    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println(this.mitarbeiterID);
    }
}
