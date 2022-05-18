package block2.oop02_01.repetition02_04;

public class Schulklasse implements IStatistik {
    private double[] noten;

    public Schulklasse(double[] noten) {
        this.noten = noten;
    }

    @Override
    public double median() {
        double result = 0;

        if (this.noten.length%2 == 0){
            result = (this.noten[(this.noten.length/2)-1] + this.noten[this.noten.length/2])*0.5;
        }else{
            result = this.noten[this.noten.length/2];
        }
return result;

    }

    @Override
    public double mittelwert() {
        double result = 0;
        for(int i = 0; i < this.noten.length; i++) {
            result += this.noten[i];
            }
        result = result/this.noten.length;
        return result;
    }
}
