
public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "jayanth";
		int count = 0;
		char[] ch= s.toCharArray();
		for(int i=0;i<s.length();i++) {
			count = 0;
			for(int j=0;j<=s.length();j++) {
				
				if(ch[i]!=ch[j]) {
					count =1;
					System.out.println(ch[j] + " " +count);
				}
			}
		}

	}

}
