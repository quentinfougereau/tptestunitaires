package testtriangle;

import org.junit.jupiter.api.*;
import triangle.Triangle;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

public class TestReadData {

    Triangle triangle1;
    Triangle triangle2;
    Triangle triangle3;
    Triangle triangle4;

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
        triangle1 = new Triangle();
        triangle2 = new Triangle();
        triangle3 = new Triangle();
        triangle4 = new Triangle();
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("Test terminé");
    }

    /*
     * test triangle crée
     */
    @Test
    void testTriangleCree() {
        try {
            triangle1.readData("triangle.txt");
            assertEquals(triangle1.typeTriangle(), 1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*
     * test levée d'une FileNotFoundException
     */
    @Test
    void testFichierNonTrouve() {
        assertThrows(FileNotFoundException.class, () -> triangle2.readData("fichierNonExistant.txt"));
    }

    /*
     * test si le fichier contient 2 valeurs
     */
    @Test
    void testFichierContientDeuxValeurs() {
        try {
            triangle3.readData("triangle2Valeurs.txt");
            assertEquals(triangle3.typeTriangle(), -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*
     * test si le fichier contient 4 valeurs (la quatrième valeur est ignorée)
     */
    @Test
    void testFichierContientQuatresValeurs() {
        try {
            triangle4.readData("triangle4Valeurs.txt");
            assertEquals(triangle4.typeTriangle(), 1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
