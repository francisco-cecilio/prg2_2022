package block1.aufgabe3;

public class Mitarbeiter extends Person{
    //Attribute
    int mitarbeiterID;

    // Konstruktor
    public Mitarbeiter(String name, String vorname, int alter, int gehalt, int ferien, int mitarbeiterID){
        super(name, vorname, alter, gehalt, ferien);
        this.mitarbeiterID = mitarbeiterID;
    }

    public int getMitarbeiterID(){
        return mitarbeiterID;
    }
}
