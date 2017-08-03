import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class AngleTest {

	@Test
	public void testDegree(){
		assertThat(Angle.degree(180).asDegrees(), is(180.0));
	}
	
	@Test
	public void testRadians(){
		assertThat(Angle.radians(2).asRadians(), is(2.0));
	}
}
