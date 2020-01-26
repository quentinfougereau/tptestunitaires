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

    /**
     * Retourne le type du triangle
     * Retourne le type du triangle en fonction des valeurs de ses trois côtés
     * @return -1 si le triangle est illégal, 1 si le triangle est scalène, 2 si le triangle est isocèle, 3 si le triangle est équilatéral
     */
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



    /**
     * Lit un fichier
     * Lit un fichier texte et modifie les attributs coteA, coteB, coteC du triangle (this)
     * @param filename le nom du fichier
     * @throws FileNotFoundException si le fichier n'existe pas
     */
    public void readData(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        String line;
        double[] tab = new double[3];
        int i = 0;
        while (scanner.hasNextLine() && i < 3) {
            line = scanner.nextLine();
            tab[i] = Double.parseDouble(line);
            i++;
        }
        this.setCoteA(tab[0]);
        this.setCoteB(tab[1]);
        this.setCoteC(tab[2]);
    }

}
