import java.util.Arrays;

public class Triangle {
	
	private Angle[] angles;
	private Length[] sides;
	
	public Angle getAngleA() {
		return angles[0];
	}
	public Angle getAngleB() {
		return angles[1];
	}
	public Angle getAngleC() {
		return angles[2];
	}
	public Length getSideA() {
		return sides[0];
	}
	public Length getSideB() {
		return sides[1];
	}
	public Length getSideC() {
		return sides[2];
	}
	
	private Triangle(Builder builder) {		
		this.angles = builder.angles;
		this.sides = builder.sides;
	}
	
	public static class Builder{
		
		private Angle[] angles = new Angle[3];
		private Length[] sides = new Length[3];
		
		public Builder sideA(Length sideA){
			this.sides[0] = sideA;
			return this;
		}
		public Builder sideB(Length sideB){
			this.sides[1] = sideB;
			return this;
		}
		public Builder sideC(Length sideC){
			this.sides[2] = sideC;
			return this;
		}
		public Builder angleA(Angle angleA) {
			this.angles[0] = angleA;
			return this;
		}
		public Builder angleB(Angle angleB) {
			this.angles[1] = angleB;
			return this;
		}
		public Builder angleC(Angle angleC) {
			this.angles[2] = angleC;
			return this;
		}
		public Triangle build(){
			if(!sideValidation()){
				throw new IllegalStateException("Triangle can't be built: Sides length are not valid");
			}
			if(!angleValidation()){
				throw new IllegalStateException("Triangle can't be built: Angles sum exceeds 180 degrees");
			}
			return new Triangle(this);			
		}
		private boolean angleValidation(){
			double angleSum = this.angles[0].asDegrees() + this.angles[1].asDegrees() + this.angles[2].asDegrees();
			return angleSum == 180;
		}
		private boolean sideValidation() {
			Length[] orderedSides = Arrays.copyOf(this.sides,sides.length);
			Arrays.sort(orderedSides);
			return orderedSides[2].getMeasure() < orderedSides[1].getMeasure() + orderedSides[0].getMeasure(); 
		}
		
	}

	@Override
	public String toString() {
		return "Triangle [angles=" + Arrays.toString(angles) + ", sides=" + Arrays.toString(sides) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(angles);
		result = prime * result + Arrays.hashCode(sides);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (!Arrays.equals(angles, other.angles))
			return false;
		if (!Arrays.equals(sides, other.sides))
			return false;
		return true;
	}

}
