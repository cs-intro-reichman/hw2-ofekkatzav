// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	
	int numOfCalculation = Integer.parseInt(args[0]);	
	double sumPositive = 0;
	double sumNegative = 0;
	
	for(double i=5;i<=numOfCalculation*2;i=i+4){// 1/5 + 1/9 + 1/13 + 1/17 + 1/21
		sumPositive =sumPositive + 1/i;
	}
	for(double i=3;i<=numOfCalculation*2;i=i+4){// 1/3 + 1/7 + 1/11 + 1/15 + 1/19 
		sumNegative = sumNegative + 1/i;
	}

	System.out.println("pi according to Java: " + Math.PI);
	System.out.println("pi, approximated: " + 4*(1 + (sumPositive - sumNegative)));

	}
}
