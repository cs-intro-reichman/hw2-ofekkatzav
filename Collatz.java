// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	
	int seed = Integer.parseInt(args[0]);
	String mode = args[1];
	int counter = 1;
	int dynamicSeed = 0;
	if(mode.equals("v")){
	for(int i=1;i<=seed;i++){
		dynamicSeed = i;
		counter =0;
			do{
				System.out.print(dynamicSeed+" ");
				if(dynamicSeed%2==0){
					dynamicSeed = dynamicSeed/2;
					counter=counter+1;
				}
				else{
					dynamicSeed=(dynamicSeed*3)+1;
					counter=counter+1;
				}
			}
			while((dynamicSeed!=1));
	System.out.print(dynamicSeed+" ");
	counter++;
	System.out.print("("+counter+")");
	System.out.println();
	}
}
else if(mode.equals("c"))
System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
}
}





	

