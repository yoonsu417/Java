package array;

public class ArrayDi0 {

    public static void main(String[] args) {
        // 2 X 3 2차원 배열
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        System.out.print(arr[0][0] + " "); //0열 출력
        System.out.print(arr[0][1] + " "); //1열 출력
        System.out.print(arr[0][2] + " "); //2열 출력
        System.out.println();

        System.out.print(arr[1][0] + " "); //0열 출력
        System.out.print(arr[1][1] + " "); //1열 출력
        System.out.print(arr[1][2] + " "); //2열 출력
    }

}
