
public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="jayanthmadhu";
		int n=2;
		 int len = str.length();
		 int chars = len/n;
		 int temp =0;
		 String arr[] = new String[n];
		 if(len%n!=0)
		 {
		 System.out.println(" This cannot be divided into"+n+"Equal parts");
		 }
		 else
		 {
		 for(int i=0;i<len;i=i+chars)
		 {
		 String substring = str.substring(i, i+chars);
		 arr[temp]=substring;
		 temp++;
		 }
		 for(String s:arr)
		 {
		 System.out.println(s);
		 }
		
		 }
	}}
	


