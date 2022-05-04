package block1.aufgabe3;

public class Main {
    public static void main(String[] args) {
        Lehrling cico = new Lehrling("Cecilio", "Francisco", 23, 4000, 5, 7);
        System.out.println("Hallo " + cico.getVorname()+ ", deine MitarbeiterID ist: " + cico.getMitarbeiterID());
    }
}
