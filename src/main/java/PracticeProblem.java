public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(sum(5,4));

	}

	public static int sum (int num1, int num2){
		int result = num1+num2;
		return result;
	}

	public static int difference (int num1, int num2){
		int result = num1-num2;
		return result; 
	}
	
	public static double product (double num1, double num2){ 
		return num1*num2;
	}

	public static String removeFirst (String line){
		return line.substring(1);

	}

	public static int combinedLength (String line1, String line2){
		return line1.length()+line2.length();
	}

	public static boolean isEven (int num){
		return (num%2==0);
	}

	public static boolean isOdd (int num){
		return !(num%2==0);
	}

	public static boolean isPositive(int num){
		return (num>0);
	}

	public static boolean isNegative(int num){
		return (num<0);
	}



}
