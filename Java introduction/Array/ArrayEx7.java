package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double average = 0;

        String[] subjects = {"국어", "영어", "수학"};
        int[][] students = new int[4][3];

        for(int row= 0; row < students.length; row++) {
            System.out.println(row + 1 + "번 학생의 성적을 입력하세요: ");
           for(int j = 0; j < 3; j++) {
               System.out.print(subjects[j] + " 점수: ");
               students[row][j] = scanner.nextInt();
           }
        }

        for(int row= 0; row < students.length; row++) {
            int total = 0;
            for(int column = 0; column < students[row].length; column++) {
                total += students[row][column];
            }
            average = (double)total/3;
            System.out.println((row + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
