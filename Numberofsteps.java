import java.util.Scanner; //This is to import the scanner

public class Numberofsteps{

	public static int numberOfSteps(int num){
		int steps=0;
		while (num!=0){
			if(num %2==0){
				num=num/2;
			}
			else{
				num=num-1;
			}
		steps=steps+1;
		}
		return steps;
	}
	
	public static void main(String [] args){
		System.out.println("Enter number:");
		Scanner in = new Scanner(System.in);
		int val = Integer.parseInt(in.nextLine());
		System.out.println(numberOfSteps((val)));
	}
	
}
