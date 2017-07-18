import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class LengthTest {
	
	@Test
	public void nonNegativeLength(){		
		Length length = Length.factory(3);
		assertThat(3.0, is(length.getMeasure()));	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void negativeLength(){
		Length length = Length.factory(-3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void zeroLength(){
		Length length = Length.factory(0.0);	
	}

}
