import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class LengthTest {
	
	@Test
	public void nonNegativeLength(){
		assertThat(Length.of(3).getMeasure(), is(3.0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void negativeLength(){
		assertThat(Length.of(-3).getMeasure(), is(-3.0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void zeroLength(){
		assertThat(Length.of(0).getMeasure(), is(0.0));
	}

}
