// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String cheerSpell = args[0];
        int numOfCheering = Integer.parseInt(args[1]);
       

        for(int i=0; i<cheerSpell.length(); i++ ){
                if("aefhilmnorsx".indexOf(cheerSpell.charAt(i)) >= 0 || "AEFHILMNORSX".indexOf(cheerSpell.charAt(i)) >= 0 )// if some of the chars exist in cheerspell(i)
                System.out.println("Give me an "+Character.toUpperCase(cheerSpell.charAt(i))+": "+Character.toUpperCase(cheerSpell.charAt(i))+"!");
                else
                System.out.println("Give me a  "+Character.toUpperCase(cheerSpell.charAt(i))+": "+Character.toUpperCase(cheerSpell.charAt(i))+"!");
        }
                System.out.println("What does that spell?");

        for(int i=0; i<numOfCheering;i++){
                System.out.println(cheerSpell + "!!!");
        }
}
        
}
