package block2.oop02_01.repetition02_01;

public class Buergerort {
    private String name;
    private Nation nation;

    public Buergerort(String name, Nation nation){
        this.name = name;
        this.nation = nation;
    }

    public String getName(){return name;}

    public Nation getNation(){return nation;}
}
