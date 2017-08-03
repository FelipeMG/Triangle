
public class Length implements Comparable<Length>{
	
	private double measure;
	
	private Length(final double measure){
		if(measure <= 0.0){
			throw new IllegalArgumentException();
		}
		this.measure = measure;
	}
	
	public static Length of(final double measure){
		return new Length(measure);
	}
	
	public double getMeasure(){
		return this.measure;
	}

	public int compareTo(Length other) {
		double distance = (this.measure - other.measure)*10  ;
		return (int)distance;
	}

	@Override
	public String toString() {
		return "Length [measure=" + measure + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Length other = (Length) obj;
		if (Double.doubleToLongBits(measure) != Double.doubleToLongBits(other.measure))
			return false;
		return true;
	}

}
