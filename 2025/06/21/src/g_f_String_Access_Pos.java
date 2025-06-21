public class g_f_String_Access_Pos {
    public static void main(String[] args) {
        String str = "JAVA";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4)); //Error -> Index 4 out of bounds for length 4
    }
}
