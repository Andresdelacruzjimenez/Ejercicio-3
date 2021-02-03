import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	Cuenta ejemplo=new Cuenta("Andrés", 3000);
	
	@BeforeEach
	void setUp() throws Exception {
	}

	

	@Test
	void testGetTitular() {
		assertEquals("Andrés", ejemplo.getTitular());
	}

	@Test
	void testSetTitular() {
		assertEquals("Andrés", ejemplo.getTitular());
	}

	@Test
	void testGetCuenta() {
		assertEquals(3000, ejemplo.getCuenta());
	}

	@Test
	void testSetCuenta() {
		assertEquals(3000, ejemplo.getCuenta());
	}

	@Test
	void testToString() {
		assertEquals("Andrés 3000.0" , ejemplo.toString());
	}

	@Test
	void testIngresar() {
		assertEquals(3100.0, ejemplo.ingresar(100.0));
	}

	@Test
	void testRetirar() {
		assertEquals(0, ejemplo.retirar(3000));
	}

}
