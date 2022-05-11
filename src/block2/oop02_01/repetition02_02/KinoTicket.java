package block2.oop02_01.repetition02_02;

public class KinoTicket extends Ticket {
    private int filmDauer;

    public KinoTicket(Ort eventOrt, String eventName, int basisPreis, int filmDauer) {
        super(eventOrt, eventName, basisPreis);
        this.filmDauer = filmDauer;
    }

    public int getFilmDauer(){return filmDauer;}

    @Override
    public double berechneTicketPreis() {
        if (getFilmDauer()>150){
            this.setTicketPreis(this.getBasisPreis() + 3);
        } else {
            this.setTicketPreis(this.getBasisPreis());
        }
        return this.getTicketPreis();
    }

}
