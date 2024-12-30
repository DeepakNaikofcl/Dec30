public class RecurrsionV3 {
public static void main(String[] args) {
			int num = 10;
			even(num);
		}
		private static void even(int num) {
			if(num >0) {
				if(num % 2==0) System.out.println(num);
				even(num-1);
			}
			return;
		}
	}