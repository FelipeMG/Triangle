import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {
	
	@Test(expected = IllegalStateException.class)
	public void invalidAngles() {
		
		Angle angleA = Angle.degree(100);
		Angle angleB = Angle.degree(45);
		Angle angleC = Angle.degree(45);
		
		Length sideA = Length.factory(1);
		Length sideB = Length.factory(1);
		Length sideC = Length.factory(1.21);
		
		Triangle invalidTriangle = 
				new Triangle.Builder()
							.angleA(angleA)
							.angleB(angleB)
							.angleC(angleC)
							.sideA(sideA)
							.sideB(sideB)
							.sideC(sideC)
							.build();
		
	}
	
	@Test(expected = IllegalStateException.class)
	public void invalidSides() {
		
		Angle angleA = Angle.degree(90);
		Angle angleB = Angle.degree(45);
		Angle angleC = Angle.degree(45);
		
		Length sideA = Length.factory(1);
		Length sideB = Length.factory(2);
		Length sideC = Length.factory(1);
		
		Triangle invalidTriangle = 
				new Triangle.Builder()
							.angleA(angleA)
							.angleB(angleB)
							.angleC(angleC)
							.sideA(sideA)
							.sideB(sideB)
							.sideC(sideC)
							.build();
		
	}
	
	@Test
	public void buildRectangleTriangle() {
		
		Angle angleA = Angle.degree(90);
		Angle angleB = Angle.degree(45);
		Angle angleC = Angle.degree(45);
		
		Length sideA = Length.factory(1);
		Length sideB = Length.factory(1);
		Length sideC = Length.factory(1.21);
		
		Triangle rectangleTriangle = 
				new Triangle.Builder()
							.angleA(angleA)
							.angleB(angleB)
							.angleC(angleC)
							.sideA(sideA)
							.sideB(sideB)
							.sideC(sideC)
							.build();
		
		assertThat(angleA, is(rectangleTriangle.getAngleA()));
		assertThat(angleB, is(rectangleTriangle.getAngleB()));
		assertThat(angleC, is(rectangleTriangle.getAngleC()));
		assertThat(sideA, is(rectangleTriangle.getSideA()));
		assertThat(sideB, is(rectangleTriangle.getSideB()));
		assertThat(sideC, is(rectangleTriangle.getSideC()));
		
	}
	
	@Test
	public void buildEquilateralTriangle() {
		
		Angle angleA = Angle.degree(60);
		Angle angleB = Angle.degree(60);
		Angle angleC = Angle.degree(60);
		
		Length sideA = Length.factory(5);
		Length sideB = Length.factory(5);
		Length sideC = Length.factory(5);
		
		Triangle equilateralTriangle = 
				new Triangle.Builder()
							.angleA(angleA)
							.angleB(angleB)
							.angleC(angleC)
							.sideA(sideA)
							.sideB(sideB)
							.sideC(sideC)
							.build();
		
		assertThat(angleA, is(equilateralTriangle.getAngleA()));
		assertThat(angleB, is(equilateralTriangle.getAngleB()));
		assertThat(angleC, is(equilateralTriangle.getAngleC()));
		assertThat(sideA, is(equilateralTriangle.getSideA()));
		assertThat(sideB, is(equilateralTriangle.getSideB()));
		assertThat(sideC, is(equilateralTriangle.getSideC()));
	}
	
	@Test
	public void buildTriangle() {
		
		Angle angleA = Angle.radians(0.5*Math.PI);
		Angle angleB = Angle.degree(30);
		Angle angleC = Angle.degree(60);
		
		Length sideA = Length.factory(5);
		Length sideB = Length.factory(5);
		Length sideC = Length.factory(5);
		
		Triangle triangle = 
				new Triangle.Builder()
							.angleA(angleA)
							.angleB(angleB)
							.angleC(angleC)
							.sideA(sideA)
							.sideB(sideB)
							.sideC(sideC)
							.build();
		
		assertThat(angleA, is(triangle.getAngleA()));
		assertThat(angleB, is(triangle.getAngleB()));
		assertThat(angleC, is(triangle.getAngleC()));
		assertThat(sideA, is(triangle.getSideA()));
		assertThat(sideB, is(triangle.getSideB()));
		assertThat(sideC, is(triangle.getSideC()));
	}

}
