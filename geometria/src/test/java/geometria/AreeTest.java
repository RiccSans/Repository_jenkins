package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreeTest {

	@Test
	public void testTriangolo() {
		int altezza=2;
		int base=4;
		int valoreAtteso=4;
		int valoreCalcolato=Aree.triangolo(altezza, base);
		assertEquals(valoreAtteso, valoreCalcolato);
	}

	@Test
	public void testQuadrato() {
		int lato=2;
		int valoreAtteso=4;
		int valoreCalcolato=Aree.quadrato(lato);
		assertEquals(valoreAtteso, valoreCalcolato);
	}

	@Test
	public void testRombo() {
		int diagMag=2;
		int diagMin=5;
		int valoreAtteso=5;
		int valoreCalcolato=Aree.rombo(diagMag, diagMin);
		assertEquals(valoreAtteso, valoreCalcolato);
	}

}
