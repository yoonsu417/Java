package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] input = new int[count];

        System.out.println(count + "개의 정수를 입력하세요: ");
        for(int i = 0; i<count; i++) {
            input[i] = scanner.nextInt();
        }

        int min = input[0];
        int max = input[0];

        for(int i = 0; i<count; i++) {
            if(min > input[i])
                min = input[i];
            if(max < input[i])
                max = input[i];
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);

    }
}
