
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

	@Override
	public String toString() {
		return "Angle [measure=" + measure + ", degrees=" + degrees + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (degrees ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(measure);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Angle other = (Angle) obj;
		if (degrees != other.degrees)
			return false;
		if (Double.doubleToLongBits(measure) != Double.doubleToLongBits(other.measure))
			return false;
		return true;
	}
		
}
