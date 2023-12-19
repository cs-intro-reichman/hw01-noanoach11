/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		 int centsNumber = Integer.parseInt(args[0]);

        //calculation
        int quarter = centsNumber/25;
        int cents = centsNumber%25;


        //printing
        System.out.println ("Use " + quarter + " quarters and " + cents + " cents");
	}
}