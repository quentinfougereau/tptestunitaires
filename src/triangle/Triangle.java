package triangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Triangle {

    private double coteA;
    private double coteB;
    private double coteC;

    public Triangle() {
    }

    public double getCoteA() {
        return coteA;
    }

    public void setCoteA(double coteA) {
        this.coteA = coteA;
    }

    public double getCoteB() {
        return coteB;
    }

    public void setCoteB(double coteB) {
        this.coteB = coteB;
    }

    public double getCoteC() {
        return coteC;
    }

    public void setCoteC(double coteC) {
        this.coteC = coteC;
    }

    public int typeTriangle() {
        if (coteA + coteB <= coteC || coteB + coteC <= coteA || coteA + coteC <= coteB) {
            return -1;
        } else {
            if (coteA == coteB && coteB == coteC) {
                return 3;
            } else if (coteA == coteB || coteB == coteC || coteA == coteC) {
                return 2;
            } else {
                return 1;
            }
        }
    }

    public void readData(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        String line;
        double[] tab = new double[3];
        int i = 0;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            tab[i] = Double.parseDouble(line);
            i++;
        }
        this.setCoteA(tab[0]);
        this.setCoteB(tab[1]);
        this.setCoteC(tab[2]);
    }

}
