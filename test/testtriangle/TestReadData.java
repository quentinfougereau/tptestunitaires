package testtriangle;

import org.junit.jupiter.api.*;
import triangle.Triangle;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

public class TestReadData {

    Triangle triangle1;
    Triangle triangle2;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        /*
         * ajouter un message
         */
        System.out.println("Démarrage des tests");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        /*
         * ajouter un message
         */
        System.out.println("Fin des tests");
    }

    @BeforeEach
    void setUp() throws Exception {
        /*
         * ajouter un message
         */
        System.out.println("Début du test");
        triangle1 = new Triangle();
        triangle2 = new Triangle();
    }

    @AfterEach
    void tearDown() throws Exception {
        /*
         * ajouter un message
         */
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

}
