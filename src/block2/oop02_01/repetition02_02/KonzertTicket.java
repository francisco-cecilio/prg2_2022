package block2.oop02_01.repetition02_02;

public class KonzertTicket extends Ticket {
    private int sitzReihe;

    public KonzertTicket(Ort eventOrt, String eventName, int basisPreis, int sitzReihe) {
        super(eventOrt, eventName, basisPreis);
        this.sitzReihe = sitzReihe;
    }

    public int getSitzReihe(){return sitzReihe;}

    @Override
    public double berechneTicketPreis() {
        this.setTicketPreis(this.getBasisPreis() * (1/(float)this.getSitzReihe()));
        return this.getTicketPreis();
    }

}
