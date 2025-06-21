public class g_d_String_Remove_Space {
    public static void main(String[] args) {
        String ss = "       한글        ABCD      efgh";
        String cutStr1, cutStr2;

        cutStr1 = ss.trim();
        cutStr2 = ss.replaceAll(" ","");

        System.out.println("기존 문자열 : "+"["+ss+"]");
        System.out.println("앞뒤 공백 제거 : "+"["+cutStr1+"]");
        System.out.println("전체 공백 제거 : "+"["+cutStr2+"]");
    }
}
