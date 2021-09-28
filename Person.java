
public class Person {
	
	double weight;
	double height;
	double BMI;

	public Person(double w, double h) {
		this.weight = w; 
		this.height = h;
		this.BMI =  w/(Math.pow(h, 2));
	}

	public double getBMI() {
		return this.BMI;
	}

	}

