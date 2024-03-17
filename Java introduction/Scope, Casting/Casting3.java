package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L;
        int intValue = 0;

        intValue = (int)maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int)maxIntOver;
        System.out.println("maxIntOver casting = " + intValue); // 출력 -2147483648

    }
}
