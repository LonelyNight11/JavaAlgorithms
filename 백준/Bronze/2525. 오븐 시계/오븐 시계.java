import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();


        B += C; // 반복되는 계산식을 미리 수행

        if (B > 59) {
            int addHour = B / 60; // 더해질 시간
            int hour = (A + addHour) % 24; // 굳이 아래 조건문 필요없이 처리
            int min = B % 60; // hour와 동일한 방식

            System.out.println(hour + " " + min);
            
        } else System.out.println(A+" "+(B));
    }
}