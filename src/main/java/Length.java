
public class Length implements Comparable<Length>{
	
	private double measure;
	
	private Length(final double measure){
		if(measure <= 0.0){
			throw new IllegalArgumentException();
		}
		this.measure = measure;
	}
	
	public static Length factory(final double measure){
		return new Length(measure);
	}
	
	public double getMeasure(){
		return this.measure;
	}

	public int compareTo(Length other) {
		double distance = (this.measure - other.measure)*10  ;
		return (int)distance;
	}

}
