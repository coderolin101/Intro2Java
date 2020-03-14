import java.util.Scanner;

public class Numberofjewels{
	public static int numJewelsInStones(String J, String S){
		int ans = 0;
		for(char s: S.toCharArray())
			for(char j: J.toCharArray())
				if(J==S){
					ans++;
					break;
					}
		return ans;
		}
	public static void main(String [] args){
		System.out.println("You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.");
		Scanner in = new Scanner(System.in);
		System.out.println("\nEnter the J (types of Jewels) to check against second string: ");
		String jewels = in.nextLine();
		System.out.println("\nEnter the S (total rocks) to check to see how many jewels: ");
		String rocks = in.nextLine();
		System.out.println(numJewelsInStones(jewels, rocks));
		}
	}
