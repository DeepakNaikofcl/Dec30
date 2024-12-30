
public class RecurrsinV2 {

	public static void main(String[] args) {
		int num = 5;
		long result = fact(num,1);
		System.out.println(result);

	}

	private static long fact(int num, int i) {
		if( i == num) return num;
		else {
			return i* fact(num,i+1);
		}
	}

}
