package block2.oop02_01.repetition02_01;

public class Main {
    public static void main(String[] args) {
        // neue Ausweise erfassen
        Ausweis ausweis1 = new Ausweis(1223344, new Mensch("Meier", "Peter", 180), new Nation("CH"), "31.12.2024");
        Ausweis ausweis2 = new Ausweis(1223345, new Mensch("Hammer", "Michael", 185), new Nation("DE"), "31.12.2024");
        Ausweis ausweis3 = new Ausweis(1223346, new Mensch("Klammer", "Franz", 190), new Nation("AUT"), "31.12.2024");

        Ausweis cico = new Identitaetskarte(7, new Mensch("Cecilio", "Francisco", 170), new Nation("PT"), "12.12.2022", new Buergerort("Entlebuch", new Nation("CH")));

        // Ausweisinformationen ausgeben
        ausweis1.printAusweisInformationen();
        ausweis2.printAusweisInformationen();
        ausweis3.printAusweisInformationen();

        cico.printAusweisInformationen();
    }
}
