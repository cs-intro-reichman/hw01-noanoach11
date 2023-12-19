/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int minRange = Integer.parseInt(args[0]);
        int maxRange = Integer.parseInt(args[1]);

        int firstNum = minRange + (int)(Math.random() * ((maxRange - minRange)));
        int seconedNum = minRange + (int)(Math.random() * ((maxRange - minRange)));
        int thirdNum = minRange + (int)(Math.random() * ((maxRange - minRange)));



        //printing
        System.out.println(firstNum);
        System.out.println(seconedNum);
        System.out.println(thirdNum);
        System.out.println ("The minimal generated number was " + Math.min(Math.min(firstNum, seconedNum), thirdNum));
	}
}
