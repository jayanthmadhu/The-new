import java.util.*;
import java.util.Arrays;
public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="mug";
		String d = "gum";
		char[] dd = s.toCharArray();
		 char[] c = d.toCharArray();
		 Arrays.sort(dd);
		 Arrays.sort(c);
		 if(s.length()==d.length())
		 {
		
		if(Arrays.equals(dd, c)==true) {
			System.out.println("yes");
		}}
		else{
			System.out.println("not a anagram");
		}
		

	}
}
