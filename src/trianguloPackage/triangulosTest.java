package trianguloPackage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


//import trianguloPackage.triangulos;

class triangulosTest {

	@Test
	void testEscaleno() {
	    assertEquals (Triangulos2.clasifica(3, 4, 5), "Escaleno");
	}

	@Test
	void testEquilatero() {
	    assertEquals (Triangulos2.clasifica(4, 4, 4), "Equilátero");
	}
	
}
