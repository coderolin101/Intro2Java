import java.util.HashSet;
import java.util.Set;


public class AddElemstoSet{
	public static void main(String [] args){
		String abc = "aabc";
		Set<Character> charSet = new HashSet<Character>();
		
		for(char c: abc.toCharArray()){
			charSet.add(c);
			}
			
		System.out.println(charSet.toString());
		}
	
	}
