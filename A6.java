import java.util.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer,String> map = new HashMap();
		 map.put(1, "jayanth");
		 map.put(2, "madhu");
		 map.put(2,"sudhan");
		 System.out.println(map.containsKey(10));
		 Object object = map.get(1);
		 System.out.println(object);
		 Set<Integer> keySet = map.keySet();
		 System.out.println(keySet);
		 Collection<String> values = map.values();
		 System.out.println(values);
		 Set<Entry<Integer, String>> entrySet = map.entrySet();
		 System.out.println(entrySet);
		 //hasNext---boolean //next---String
		 Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		 while(iterator.hasNext())
		 {
		 Entry<Integer, String> next = iterator.next();
		 System.out.println(next);
		 }
		 //for each loop
		 for(Map.Entry<Integer, String> en:map.entrySet())
		 {
		 System.out.println(en.getKey()+":"+en.getValue());
		 }
		 

	}

}
