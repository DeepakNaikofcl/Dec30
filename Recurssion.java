public class Recurssion {
	public static void main(String[] args) {
		int num = 20;
long result = factorial(num);
		System.out.println(result);
	}
	private static long factorial(int n) {
		return n > 1 ? n*factorial(n-1):1;
		
	}
}