import java.util.Scanner;

public class e_b_Various_Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double num;
        System.out.print("실수를 입력하세요 :");
        num = s.nextDouble();
        System.out.println("사용자가 입력한 값 : "+num);

        String str;
        System.out.print("문자열을 입력하세요 : ");
        str = s.next();
        System.out.println("사용자가 입력한 문자 : "+str);

        s.close();
    }
}
