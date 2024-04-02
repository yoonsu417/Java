package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요: ");

        int count = scanner.nextInt();
        int[] input = new int[count];
        int total = 0;
        double average = 0;

        System.out.println(count + "개의 정수를 입력하세요.");

        for(int i = 0; i<count; i++) {
            input[i] = scanner.nextInt();
            total += input[i];
        }

        average = (double)total/count;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
