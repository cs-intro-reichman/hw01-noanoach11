/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		int firstNumber = Integer.parseInt(args[0]);
        int SecondNumber = Integer.parseInt(args[1]);

        //printing
        System.out.println (firstNumber + " + " + SecondNumber + " = " + (firstNumber+SecondNumber));	
	}
}
