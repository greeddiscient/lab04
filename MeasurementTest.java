import static org.junit.Assert.*;

import org.junit.Test;

public class MeasurementTest {

	@Test
	public void testEmptyConstructor() {
		Measurement shaun= new Measurement();
		assertEquals(shaun.getFeet(),0);
		assertEquals(shaun.getInches(),0);
	}
	
	@Test
	public void testFootConstructor(){
		Measurement shaun= new Measurement(5);
		assertEquals(shaun.getFeet(),5);
		assertEquals(shaun.getInches(),0);
	}
	
	@Test
	public void testFootInchesConstructor(){
		Measurement shaun= new Measurement(6,1);
		assertEquals(shaun.getFeet(),6);
		assertEquals(shaun.getInches(),1);
	}
	
	@Test
	public void testPlus(){
		Measurement shaun= new Measurement(6,8);
		Measurement john= new Measurement(5,8);
		Measurement shon=shaun.plus(john);
		assertEquals(shon.getFeet(), 12);
		assertEquals(shon.getInches(), 4);
		
	}
	
	@Test
	public void testMinus(){
		Measurement shaun= new Measurement(6,2);
		Measurement john= new Measurement(5,8);
		Measurement shon=shaun.minus(john);
		assertEquals(shon.getFeet(), 0);
		assertEquals(shon.getInches(), 6);
		
	}

	public void testMultiple(){
		Measurement shaun= new Measurement(6,2);
		Measurement twoshauns=shaun.multiple(2);
		assertEquals(twoshauns.getFeet(), 12);
		assertEquals(twoshauns.getInches(), 4);
		
	}

	public void testString(){
		Measurement shaun= new Measurement(6,2);
		assertEquals(shaun.toString(),"6'12\"");
		
	}
}
