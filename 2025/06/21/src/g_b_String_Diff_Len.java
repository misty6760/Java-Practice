import java.util.Scanner;

public class g_b_String_Diff_Len {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String var1, var2;
        int diff;

        System.out.println("첫 번째 문자열: ");
        var1 = s.nextLine();
        System.out.println("두 번째 문자열: ");
        var2 = s.nextLine();

        diff = var1.length() - var2.length();
        System.out.println("두 문자열의 길이 차는 "+diff+"입니다.");
        s.close();
    }
}
