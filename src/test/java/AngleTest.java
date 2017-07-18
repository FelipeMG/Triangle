import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class AngleTest {

	@Test
	public void testDegree(){		
		Angle angle = Angle.degree(180);
		assertThat(180.0, is(angle.asDegrees()) );
	}
	
	@Test
	public void testRadians(){		
		Angle angle = Angle.radians(2);
		assertThat(2d, is(angle.asRadians()) );
	}
}
