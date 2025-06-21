public class g_e_String_Find {
    public static void main(String[] args) {
        String str = "난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재미있네요.";

        System.out.println("'난생' 인덱스 번호 : "+str.indexOf("난생"));
        System.out.println("'처' 인덱스 번호 : "+str.indexOf("처"));
        System.out.println("'처음' 인덱스 번호 : "+str.indexOf("처음"));
        System.out.println("4번째 인덱스에서부터 '처음' 인덱스 번호 : "+str.indexOf("처음",4));
    }
}
