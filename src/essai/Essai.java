package essai;

public class Essai {

    private double val;

    public Essai(double val) {
        this.val = val;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

    public void ajouter(double v) {
        this.val = v;
    }

    public double inverserVal() throws IllegalArgumentException {
        if (this.val == 0.0)
            throw new IllegalArgumentException();
        return 1 / this.val;
    }

    public double infinite() {
        while (true) {

        }
    }
}
