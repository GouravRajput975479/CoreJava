package in.com.rays;


public class Divisible {
public static void main(String[] args) {
		
	int a=7;
	int count=0;
	int sum=0;

	for (int i = 10; i <=50; i++) {
		
		if (i%a==0) {
			
			count=i;
			
			System.out.println(count);
			sum+=i;
		}
		
	}
	
System.out.println(sum);
}
	

}
