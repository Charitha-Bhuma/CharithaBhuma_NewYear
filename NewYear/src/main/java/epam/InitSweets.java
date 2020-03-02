package epam;

public class InitSweets extends Sweets {
	
	void setWeight(double weight) {
		this.weight = weight;
	}
	double calcWeight (int numOfSweets) {
		return numOfSweets * weight;
	}
}
