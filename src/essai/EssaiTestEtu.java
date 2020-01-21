package essai;

import essai.Essai;

/*ATTENTION: rajouter les imports nécessaires pour vos tests*/

/* nécessaire pour les timeout */
import static java.time.Duration.ofMillis;

/* importer les assertions utilisées */
import static org.junit.jupiter.api.Assertions.*;
/* importer les annotations utilisées*/
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import java.time.Duration;

class EssaiTestEtu {

	Essai essai;  //à initialiser avant chaque test!!!
	Essai essai1;  //à initialiser avant chaque test!!!
	Essai essai2;  //à initialiser avant chaque test!!!
	
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
		essai = new Essai(0.0);
		essai1 = new Essai(5.0);
		essai2 = new Essai(-445.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		/*
		 * ajouter un message
		 */
		System.out.println("Test terminé");
	}

	/*
	 * désactiver ce test
	 */
	@Test
	@Disabled
	void test() {
		fail("Not yet implemented");
	}

	/*
	 * test de getVal()
	 */
	@Test
	public final void testGetVal() {
		double val = essai1.getVal();
		double expected = 5.0;
		assertEquals(val, expected);
	}

	/*
	 * test de setVal(double v)
	 */
	@Test
	public final void testSetVal() {
		essai2.setVal(2000.0);
		double val = essai2.getVal();
		double expected = 2000.0;
		assertEquals(val, expected);
	}

	/*
	 * test du constructeur de Essai
	 */
	@Test
	public final void testConstructor() {
		Essai essai3 = new Essai(667.0);
		double expected = 667.0;
		assertEquals(essai3.getVal(), expected);
	}

	/*
	 * un exemple de test pour l'inverse
	 */
	@Test()
	public final void testInverse(){
		essai.setVal(2.0);
		double val = essai.inverserVal();
		double expected = 1/ 2.0;
		assertTrue(val == expected);
	}
	
	/*
	 * Ecrire un test vérifiant que diviser par zéro lève une exception
	 */
	@Test
	public final void testExceptionInverse() {
		essai.setVal(0.0);
		assertThrows(IllegalArgumentException.class, () -> essai.inverserVal());
	}
	
	/*
	 * Ecrire un test qui échoue si le calcul avec infinite prend trop de temps 
	 */
	@Test
	public final void testTimeoutInfinite() {
		assertTimeoutPreemptively(ofMillis(100), () -> essai.infinite());
	}
		
}
