import java.util.*;
public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = " madhu sudhan jayanth";
		 String m = s.replace(" ", "");
		 System.out.println(m);
		 char[] charArray = m.toCharArray();
		 Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		 for(char ch:charArray)
		 {
		 if(!map.containsKey(ch))
		 {
		 map.put(ch, 1);
		 }else
		 {
		 }
		 int values= map.get(ch);
		 map.put(ch, values+1);
		 }
		 System.out.println(map + " ");
	}

}
