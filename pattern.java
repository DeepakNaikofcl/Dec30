public class pattern {

    public static void main(String[] args) {
        Patrn(123456789);
    }
    private static void Patrn(int num) {
      if (num == 0) {
            return;
        }
        System.out.println(num);

        Patrn(num / 10);
    }
}

