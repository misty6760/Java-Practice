import java.util.Scanner;

public class e_a_Int_Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        num = s.nextInt();
        System.out.println("사용자가 입력한 값 => "+num);
        s.close();
    }
}
