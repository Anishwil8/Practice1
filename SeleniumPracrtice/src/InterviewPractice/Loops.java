package InterviewPractice;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub..
		printNum(1);
	    loopWithoutNos();
	}
		
	
	public static void printNum(int num) {
		
		if(num <=100) {
			System.out.println("Function 1> "+num);
			num++;
			printNum(num);   // Recursive calling of function
		}
			
	}

   public static void loopWithoutNos() {
	   int one='A'/'A';
	   String s1 ="..........";
	   
	   for (int i=one;i<=(s1.length()*s1.length()); i++) {
		   System.out.println("Function 2>"+i);
		   
	   }
   }

}
