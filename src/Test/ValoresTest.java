package Test;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import Classes.Valores;
import junit.framework.TestCase;

public class ValoresTest extends TestCase {
	
	private Valores valoresClasse = new Valores();
	
	@Test
	public void testInserir() {
		int v1 = 100;
		assertEquals(true,valoresClasse.ins(v1));
		v1 = -5;
		assertEquals(false, valoresClasse.ins(v1));
		v1 = 15;
		assertEquals(true,valoresClasse.ins(v1));
		v1 = 5;
		assertEquals(true,valoresClasse.ins(v1));
		v1 = 25;
		assertEquals(true,valoresClasse.ins(v1));
		v1 = 55;
		assertEquals(true,valoresClasse.ins(v1));
		v1 = 65;
		assertEquals(true,valoresClasse.ins(v1));
		v1 = 75;
		assertEquals(true,valoresClasse.ins(v1));
		v1 = 85;
		assertEquals(true,valoresClasse.ins(v1));
		v1 = 95;
		assertEquals(true,valoresClasse.ins(v1));
		v1 = 40;
		assertEquals(true, valoresClasse.ins(v1));
		v1 = 18;
		assertEquals(false, valoresClasse.ins(v1));
		
		}
	
	@Test
	public void testDelete() {
		inserirValoresArray();
		assertEquals(75,valoresClasse.del(6));
		assertNotEquals(25,valoresClasse.del(2));
		assertNotEquals(75,valoresClasse.del(6));
	}
	
	@Test
	public void testSize() {
		inserirValoresArray();
		valoresClasse.del(6);
		valoresClasse.del(2);
		assertEquals(8,valoresClasse.size());
		assertNotEquals(5,valoresClasse.size());
	}
	
	public void testMean() {
		inserirValoresArray();
		valoresClasse.del(6);
		valoresClasse.del(2);
		assertEquals(60d,valoresClasse.mean());
		assertNotEquals(78d, valoresClasse.mean());
	}
	
	@Test
	public void testGreater() {
		inserirValoresArray();
		assertEquals(100,valoresClasse.greater());
		assertNotEquals(85,valoresClasse.greater());
	}
	
	@Test
	public void testLower() {
		inserirValoresArray();
		valoresClasse.del(6);
		valoresClasse.del(2);
		assertEquals(15,valoresClasse.lower());
		assertNotEquals(5,valoresClasse.lower());
		
	}

	private void inserirValoresArray() {
		int v1 = 100;
		
		valoresClasse.ins(v1);
		v1 = 15;
		valoresClasse.ins(v1);
		v1 = 5;
		valoresClasse.ins(v1);
		v1 = 25;
		valoresClasse.ins(v1);
		v1 = 55;
		valoresClasse.ins(v1);
		v1 = 65;
		valoresClasse.ins(v1);
		v1 = 75;
		valoresClasse.ins(v1);
		v1 = 85;
		valoresClasse.ins(v1);
		v1 = 95;
		valoresClasse.ins(v1);
		v1 = 40;
		valoresClasse.ins(v1);
		v1 = 18;
		
	}
	
	}
