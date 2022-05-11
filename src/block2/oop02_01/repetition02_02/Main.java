package block2.oop02_01.repetition02_02;

public class Main {
    public static void main(String[] args) {
        // neues SportTicket
        Ticket sportTicket = new SportTicket(new Ort("Luzern"), "Pokalfinale", 50, 5);
        //System.out.printf("%s Ticketpreis: %f.-", sportTicket.getEventName(), sportTicket.berechneTicketPreis());

        Ticket kino = new KinoTicket(new Ort("Zürich"), "Titanic", 50, 151);
        //System.out.printf("Filmname %s, Preis: %f", kino.getEventName(), kino.berechneTicketPreis());

        Ticket konzert = new KonzertTicket(new Ort("Bern"), "Lucky Chops", 50, 5);
        System.out.printf("Konzert: %s, Preis: %f", konzert.getEventName(), konzert.berechneTicketPreis());
    }
}
