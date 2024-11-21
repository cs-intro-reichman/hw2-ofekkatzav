// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	
	int numOfCalculation = Integer.parseInt(args[0]);	
	double piAppro = 0.0;

	
	for (int i = 0; i < numOfCalculation; i++) {
		double term = 1.0 / (2 * i + 1); // Current term
		if (i % 2 == 0) 
			piAppro += term; // Add for even-indexed terms
		else 
			piAppro -= term; // Subtract for odd-indexed terms
		
	}
	
	piAppro*=4;
	System.out.println("pi according to Java: " + Math.PI);
	System.out.println("pi, approximated: " + piAppro);

	}
}

