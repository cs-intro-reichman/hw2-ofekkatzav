// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String cheerSpell = args[0];
        int numOfCheering = Integer.parseInt(args[1]);
       

        for(int i=0; i<cheerSpell.length(); i++ ){
                if("aefhilmnorsx".indexOf(cheerSpell.charAt(i)) >= 0 || "AEFHILMNORSX".indexOf(cheerSpell.charAt(i)) >= 0 )// if some of the chars exist in cheerspell(i)
                System.out.println("give me an "+cheerSpell.charAt(i)+": "+cheerSpell.charAt(i)+"!");
                else
                System.out.println("give me a "+cheerSpell.charAt(i)+": "+cheerSpell.charAt(i)+"!");
        }
                System.out.println("What does that spell?");

        for(int i=0; i<numOfCheering;i++){
                System.out.println(cheerSpell + "!!!");
        }
        }
}
