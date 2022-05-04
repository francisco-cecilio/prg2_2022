package block1.aufgabe3;

public class Manager extends Person{
    int managerID;

    public Manager(String name, String vorname, int alter, int gehalt, int ferien, int managerID){
        super(name, vorname, alter, gehalt, ferien);
        this.managerID = managerID;
    }

    public int getManagerID(){
        return managerID;
    }
}
