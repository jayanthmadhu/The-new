
public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {10,20,30,20,10};
int first = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;
for(int ch:arr) {
	if(ch>first) {
		second = first;
		first = ch;
	}
	else {
		if(ch>second && ch!=first) {
			second =ch;
		}
	}
}
System.out.println(second);


	}

}
