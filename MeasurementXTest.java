import static org.junit.Assert.*;

import org.junit.Test;

public class MeasurementXTest {

	@Test
	public void test() {
		MeasurementX shaun= new MeasurementX(6,1);
		MeasurementX djurus= new MeasurementX(6,1);
		assertEquals(shaun, djurus);
		assertTrue(shaun.equals(djurus));
		
	}

}
