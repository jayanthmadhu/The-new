import java.util.*;
public class J {
	public static void main(String[] args) {
		Map<String,Integer> s = new HashMap<>();
		s.put("apple", 100);
		s.put("banana", 100);
		s.put("orange", 100);
       s.forEach((name, salary) ->System.out.println("key is "+ name + "valie is " + salary));
		
		
	}

}
