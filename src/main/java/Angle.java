
public class Angle {
	
	private double measure;
	private boolean degrees;
	
	private Angle(final double measure, final boolean degrees) {
		this.measure = measure;
		this.degrees = degrees;
	}
	
	public static Angle degree(final double measure) {
		return new Angle(measure, true);
	}
	
	public static Angle radians(final double measure) {
		return new Angle(measure, false);
	}
	
	public double asDegrees() {
		return degrees ? this.measure : Math.toDegrees(this.measure);
	}
	
	public double asRadians() {
		return degrees ? Math.toRadians(this.measure) : this.measure;
	}
}
