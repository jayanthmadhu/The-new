
public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="jayanth";
char[] ch = s.toCharArray();
for(char d:ch) {
	System.out.println(d);
}
System.out.println("length" +ch.length);
System.out.println(s.substring(3));
System.out.println(s.substring(0,4));
int index = s.indexOf('n');
System.out.println(index);
String st= "water is water";
System.out.println( st.replaceAll("water","fire"));
System.out.println( st.replaceFirst("water","fire"));
String[] str =st.split(" ");
System.out.println( str[0]);



	}

}
