import java.util.Scanner;

public class h_Rock_Scissor_Paper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String myhand, comhand;

        System.out.println("나의 가위바위보 : ");
        myhand = s.next();

        String[] hands = {"가위", "바위", "보"};
        int rnd = (int)(Math.random() * hands.length);
        comhand = hands[rnd];
        System.out.println("컴퓨터의 가위바위보 : "+comhand);

        if(myhand.equals("가위")) {
            if(comhand.equals("가위"))
                System.out.println("비겼습니다.");
            else if(comhand.equals("바위"))
                System.out.println("졌습니다.");
            else System.out.println("이겼습니다.");
        }
        else if(myhand.equals("바위")) {
            if (comhand.equals("가위"))
                System.out.println("이겼습니다.");
            else if (comhand.equals("바위"))
                System.out.println("비겼습니다.");
            else System.out.println("졌습니다.");
        }
        else if(myhand.equals("보")) {
            if (comhand.equals("가위"))
                System.out.println("졌습니다.");
            else if (comhand.equals("바위"))
                System.out.println("이겼습니다.");
            else System.out.println("비겼습니다.");
        }
        else System.out.println("가위, 바위, 보 중에서 하나를 내세요.");

        s.close();
    }
}
