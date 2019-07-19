public class Printer {
    private int tonelevel;
    private int numberofpages;
    private boolean duplex;

    public Printer() {
        tonelevel = 50;
        numberofpages = 1000;
        duplex = true;
    }

    public int getTonelevel() {
        return tonelevel;
    }

    public void setTonelevel(int tonelevel) {

        this.tonelevel = tonelevel;
    }

    public int getNumberofpages() {
        return numberofpages;
    }

    public void setNumberofpages(int numberofpages) {
        this.numberofpages = numberofpages;

    }

    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {

        this.duplex = duplex;
    }

    public void addToner(int addtonerlevel) {
        this.tonelevel = this.tonelevel + addtonerlevel;
        setTonelevel();
    }

    public void stimulatePrint() {

    }
}

public class TakePrint{
    public static void main(String[] args) {
        Printer print = new Printer();
        
    }
}