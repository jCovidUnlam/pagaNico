package src;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PagaNicoTest {
	PagaNico pizza;
	
	@Before
	public void setUp() {
		pizza = new PagaNico();
	}
	
	@Test
	public void testEjemplo1() {
		Assert.assertEquals(140, pizza.pagaNico(140));
	}

	@Test
	public void testEjemplo2() {
		Assert.assertEquals(305, pizza.pagaNico(925));
	}

	@Test
	public void testEjemplo3() {
		Assert.assertEquals(167, pizza.pagaNico(250));
	}

	@Test
	public void nicoNoPaga() {
		Assert.assertEquals(0, pizza.pagaNico(500));
	}

	@Test
	public void soloPagaNico() {
		Assert.assertEquals(200, pizza.pagaNico(200));
	}

	@Test
	public void PaganNicoYLucas120() {
		Assert.assertEquals(240, pizza.pagaNico(360));
	}

	@Test
	public void laPizzaMasCara() {
		Assert.assertEquals(379, pizza.pagaNico(999));
	}

	@Test
	public void paganNicoYJoa() {
		Assert.assertEquals(1, pizza.pagaNico(501));
	}

	@Test
	public void paganNicoYJoa2() {
		Assert.assertEquals(200, pizza.pagaNico(700));
	}

	@Test
	public void paganNicoYJoa3() {
		Assert.assertEquals(167, pizza.pagaNico(750));
	}

	@Test
	public void paganNicoYJoa4() {
		Assert.assertEquals(240, pizza.pagaNico(860));
	}

	@Test
	public void testMenos200() {
		assertEquals(150, pizza.pagaNico(150));
	}

	@Test
	public void test200() {
		assertEquals(200, pizza.pagaNico(200));
	}

	@Test
	public void testEntre200y500Menor120() {
		assertEquals(200, pizza.pagaNico(300));
	}

	@Test
	public void testEntre200y500Igual120() {
		assertEquals(240, pizza.pagaNico(360));
	}

	@Test
	public void testEntre200y500Mayor120() {
		assertEquals(280, pizza.pagaNico(400));
	}

	@Test
	public void test500() {
		assertEquals(0, pizza.pagaNico(500));
	}

	@Test
	public void testMas500Menos200() {
		assertEquals(30, pizza.pagaNico(530));
	}

	@Test
	public void testMas500Igual200() {
		assertEquals(200, pizza.pagaNico(700));
	}

	@Test
	public void testMas500Mayor200Menor120() {
		assertEquals(200, pizza.pagaNico(800));
	}

	@Test
	public void testMas500Mayor200Igual120() {
		assertEquals(240, pizza.pagaNico(860));
	}

	@Test
	public void testMas500Mayor200Mayor120() {
		assertEquals(280, pizza.pagaNico(900));
	}
	
	@Test
	public void testRedondeoAFavorDeLucas() {
		assertEquals(240, pizza.pagaNico(359));
	}
}
