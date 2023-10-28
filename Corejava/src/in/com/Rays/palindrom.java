package in.com.Rays;

public class palindrom {
public static void main(String[] args) {
	
	int number = 121;
	int n = number;
	int r = 0;
	int sum = 0;
	
	while(n>0) {
	r = n%10;
	sum = (sum*10)+(r);
	n=n/10;
	}
	if(sum == number) {
		System.out.println(sum + "  is a palindrom number");
	}else {
		System.out.println(sum +" is not palindrom");
	
}
	
	
}
}
