

public class DataType {

    final double PI = 3.1415926535;
    public static void main(String[] args) {
        byte b = (byte) (Math.pow(2, 7) - 1);
        short s = (short) (Math.pow(2, 15) - 1);
        int i = (int) (Math.pow(2, 31) - 1);
        // long截断之后会变成int的最大值
        int i1 = (int) (Math.pow(2, 63) - 1);
        long l = (long) (Math.pow(2, 63) - 1);

//        System.out.println(b);
//        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(i1);

        // float 在设置初始变量的时候F是必须加上的
        float f = 12.34F;
        double d = 12.23;

        boolean bool = true;
        char c = 'A';

        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(c);

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println(min);
        System.out.println(max);

        //0表示八进制，0x表示16进制
        int decimal = 100;
        int octal = 0144;
        int hexa = 0x64;

        //表示Unicode字符时,unicode转义符后面跟的是四位的十六进制数
        char ch = '\u0001';
        String str = "\u0001";
    }
}
