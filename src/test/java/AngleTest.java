import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class AngleTest {

	@Test
	public void testGradConversion(){
		
		Angle angle = new Angle(120, AngleUnit.GRAD);
		double number = 120;
		assertEquals(number, angle.getAngleMeasure(),0.01);
		angle.toRad();
		System.out.println(angle.getAngleMeasure());
		angle.toGrad();
		System.out.println(angle.getAngleMeasure());
		assertEquals(number, angle.getAngleMeasure(),0.01);

		
	}
}
