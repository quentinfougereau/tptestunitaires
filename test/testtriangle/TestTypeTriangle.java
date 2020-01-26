package testtriangle;

import org.junit.jupiter.api.*;
import triangle.Triangle;

import static org.junit.jupiter.api.Assertions.*;

public class TestTypeTriangle {

    Triangle scalene;
    Triangle isoceleAB;
    Triangle isoceleBC;
    Triangle isoceleAC;
    Triangle equilateral;
    Triangle illegal;
    Triangle nulCoteA;
    Triangle nulCoteB;
    Triangle nulCoteC;
    Triangle negatifCoteA;
    Triangle negatifCoteB;
    Triangle negatifCoteC;
    Triangle plat;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Démarrage des tests");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("Fin des tests");
    }

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Début du test");

        /* triangle scalène */
        scalene = new Triangle();
        scalene.setCoteA(12.5);
        scalene.setCoteB(14);
        scalene.setCoteC(10);

        /* triangles isocèles */
        isoceleAB = new Triangle();
        isoceleAB.setCoteA(12.5);
        isoceleAB.setCoteB(12.5);
        isoceleAB.setCoteC(10);

        isoceleBC = new Triangle();
        isoceleBC.setCoteA(12.5);
        isoceleBC.setCoteB(14);
        isoceleBC.setCoteC(14);

        isoceleAC = new Triangle();
        isoceleAC.setCoteA(12.5);
        isoceleAC.setCoteB(14);
        isoceleAC.setCoteC(12.5);

        /* triangle équilatéral */
        equilateral = new Triangle();
        equilateral.setCoteA(4);
        equilateral.setCoteB(4);
        equilateral.setCoteC(4);

        /* triangle illégal */
        illegal = new Triangle();
        illegal.setCoteA(667);
        illegal.setCoteB(444);
        illegal.setCoteC(69);

        /* triangles avec une valeur nulle */
        nulCoteA = new Triangle();
        nulCoteA.setCoteA(0);
        nulCoteA.setCoteB(14);
        nulCoteA.setCoteC(10);

        nulCoteB = new Triangle();
        nulCoteB.setCoteA(12.5);
        nulCoteB.setCoteB(0);
        nulCoteB.setCoteC(10);

        nulCoteC = new Triangle();
        nulCoteC.setCoteA(12.5);
        nulCoteC.setCoteB(14);
        nulCoteC.setCoteC(0);

        /* triangles avec une valeur négative */
        negatifCoteA = new Triangle();
        negatifCoteA.setCoteA(-3);
        negatifCoteA.setCoteB(14);
        negatifCoteA.setCoteC(10);

        negatifCoteB = new Triangle();
        negatifCoteB.setCoteA(12.5);
        negatifCoteB.setCoteB(-8);
        negatifCoteB.setCoteC(10);

        negatifCoteC = new Triangle();
        negatifCoteC.setCoteA(12.5);
        negatifCoteC.setCoteB(14);
        negatifCoteC.setCoteC(-1);

        /* test triangle plat */
        plat = new Triangle();
        plat.setCoteA(3);
        plat.setCoteB(2);
        plat.setCoteC(5);
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("Test terminé");
    }

    /*
     * test triangle scalène
     */
    @Test
    void testScalene() {
        int val = scalene.typeTriangle();
        int expected = 1;
        assertEquals(expected, val);
    }

    /*
     * test triangle isocèle (coteA = coteB)
     */
    @Test
    void testIsoceleAB() {
        int val = isoceleAB.typeTriangle();
        int expected = 2;
        assertEquals(expected, val);
    }

    /*
     * test triangle isocèle (coteB = coteC)
     */
    @Test
    void testIsoceleBC() {
        int val = isoceleBC.typeTriangle();
        int expected = 2;
        assertEquals(expected, val);
    }

    /*
     * test triangle isocèle (coteA = coteC)
     */
    @Test
    void testIsoceleAC() {
        int val = isoceleAC.typeTriangle();
        int expected = 2;
        assertEquals(expected, val);
    }

    /*
     * test triangle équilatéral
     */
    @Test
    void testEquilateral() {
        int val = equilateral.typeTriangle();
        int expected = 3;
        assertEquals(expected, val);
    }

    /*
     * test triangle illégal
     */
    @Test
    void testIllegal() {
        int val = illegal.typeTriangle();
        int expected = -1;
        assertEquals(expected, val);
    }

    /*
     * test triangle nul (coteA = 0)
     */
    @Test
    void testNulCoteA() {
        int val = nulCoteA.typeTriangle();
        int expected = -1;
        assertEquals(expected, val);
    }

    /*
     * test triangle nul (coteB = 0)
     */
    @Test
    void testNulCoteB() {
        int val = nulCoteB.typeTriangle();
        int expected = -1;
        assertEquals(expected, val);
    }

    /*
     * test triangle nul (coteC = 0)
     */
    @Test
    void testNulCoteC() {
        int val = nulCoteC.typeTriangle();
        int expected = -1;
        assertEquals(expected, val);
    }

    /*
     * test triangle négatif (coteA < 0)
     */
    @Test
    void testNegatifCoteA() {
        int val = negatifCoteA.typeTriangle();
        int expected = -1;
        assertEquals(expected, val);
    }

    /*
     * test triangle négatif (coteB < 0)
     */
    @Test
    void testNegatifCoteB() {
        int val = negatifCoteB.typeTriangle();
        int expected = -1;
        assertEquals(expected, val);
    }

    /*
     * test triangle négatif (coteC < 0)
     */
    @Test
    void testNegatifCoteC() {
        int val = negatifCoteC.typeTriangle();
        int expected = -1;
        assertEquals(expected, val);
    }

    /*
     * test triangle plat
     */
    @Test
    void testPlat() {
        int val = plat.typeTriangle();
        int expected = -1;
        assertEquals(expected, val);
    }

}
