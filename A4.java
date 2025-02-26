
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Madhu sudhan";
		 int vowels =0,consonents=0;
		 s= s.toLowerCase();
		 for (int i = 0; i < s.length(); i++) {
		 if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u')
		 {
		 vowels++;
		 }
		 else if(s.charAt(i)!='a'|| s.charAt(i)!='e'||s.charAt(i)!='i'||
		 s.charAt(i)!='o'||s.charAt(i)!='u')
		 {
		 if(s.charAt(i) >= 'a' && s.charAt(i)<='z') {
		 consonents++;
		 }
		 }
		 }
		 System.out.println(vowels);
		 System.out.println(consonents);

	}

}
