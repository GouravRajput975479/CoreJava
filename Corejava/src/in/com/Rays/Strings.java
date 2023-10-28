package in.com.Rays;



public class Strings {
	
	public static void main(String[] args) {
		
		
//    String S1 = "gourav rajput";
//    
//    
//    for(char ch = 'a'; ch<'z';ch++) {
//    	int count=0;
// 		
//    for(int i=0; i<S1.length();i++) {
//    	
//    if(S1.charAt(i) ==ch) {
//    	count ++;
//    }
//    	}
//    if(count>0) {
//    	System.out.println(ch+"="+count);
//    }
//    
//    }
// 
//		
//		
//		
		int number = 4422;
		int count = 0;
		
		int[]notes = {2000,500,200,100,50,20,10,5,2,1};
		
		for(int i=0; i<notes.length;i++) {
			count=number/notes[i];
			
			number = number%notes[i];
			
			
			if(count>0) {
				System.out.println(notes[i] + "="+ count);
			}
			
		}
		
		
		
		
		
		
		
		
}
	

}
