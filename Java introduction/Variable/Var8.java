package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127, 1byte
        short s = 32767; //-32678 ~ 32767, 2byte
        int i = 2147483647; //-2147483648 ~ 2147483647 (약 20억), 4byte

        //-9223372036854775808 ~ 9223372036854775807, 8byte
        long l = 9223372036854775807L;

        //실수
        float f = 10.0f; //4byte
        double d = 10.0; //8byte
    }
}
