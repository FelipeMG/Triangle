
public class Angle {
	
	private double angleMeasure;
	private AngleUnit unit;

	public Angle(double angleMeasure, AngleUnit unit){
		if(angleMeasure>0){
			this.angleMeasure = angleMeasure;
			this.unit = unit;
		}
		else{
			throw new IllegalArgumentException("Angle should be greater than 0");
		}
	}
	
	public void toGrad(){
		this.angleMeasure = this.angleMeasure * 180 / Math.PI;
		this.unit = AngleUnit.GRAD;
	}
	
	public void toRad(){
		this.angleMeasure = this.angleMeasure * Math.PI / 180;
		this.unit = AngleUnit.RAD;
	}

	public double getAngleMeasure() {
		return angleMeasure;
	}

	public void setAngleMeasure(double angleMeasure) {
		this.angleMeasure = angleMeasure;
	}

	public AngleUnit getUnit() {
		return unit;
	}

	public void setUnit(AngleUnit unit) {
		this.unit = unit;
	}	

}
