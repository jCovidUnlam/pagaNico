package src;

import org.junit.Assert;
import org.junit.Test;

public class PagaNicoTest {

	@Test
	public void testEjemplo1() {
		Assert.assertEquals(140, PagaNico.pagaNico(140));
	}
	
	@Test
	public void testEjemplo2() {
		Assert.assertEquals(305, PagaNico.pagaNico(925));
	}
	
	@Test
	public void testEjemplo3() {
		Assert.assertEquals(167, PagaNico.pagaNico(250));
	}
	
	@Test
	public void nicoNoPaga() {
		Assert.assertEquals(0, PagaNico.pagaNico(500));
	}
	
	@Test
	public void soloPagaNico() {
		Assert.assertEquals(200, PagaNico.pagaNico(200));
	}
	
	@Test
	public void PaganNicoYLucas120() {
		Assert.assertEquals(240,  PagaNico.pagaNico(360));
	}
	
	@Test
	public void laPizzaMasCara() {
		Assert.assertEquals(379, PagaNico.pagaNico(999));
	}
	
	@Test
	public void paganNicoYJoa() {
		Assert.assertEquals(1, PagaNico.pagaNico(501));
	}
	
	@Test
	public void paganNicoYJoa2() {
		Assert.assertEquals(200, PagaNico.pagaNico(700));
	}
	
	@Test
	public void paganNicoYJoa3() {
		Assert.assertEquals(167, PagaNico.pagaNico(750));
	}
	
	@Test
	public void paganNicoYJoa4() {
		Assert.assertEquals(240, PagaNico.pagaNico(860));
	}
	


}
