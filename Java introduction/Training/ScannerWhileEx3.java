package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double count = 0;
        int num = 0;
        while(true) {
            num = scanner.nextInt();

            if (num == -1) {
                break;
            } else {
                sum += num;
                count++;
            }
        }
        /*
        while((num = scanner.nextInt()) != -1) {
            sum += num;
            count++;
        }
        */
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + sum/count);
    }
}
