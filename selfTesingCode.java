import java.util.Scanner;
import java.lang.*;
import java.text.*;

public class selfTesingCode{
    static float Q_rsqurt(float x) {
        int i;
        float x2, y;
        final float thereehalfs = 1.5f;

        x2 = x * 0.5f;
        y = x;
        i = Float.floatToIntBits(y);
        i = 0x5f3759df - (i >> 1);
        y = Float.intBitsToFloat(i);
        y = y * (thereehalfs - (x2 * y * y));
        y = y * (thereehalfs - (x2 * y * y));
        y = y * (thereehalfs - (x2 * y * y));

        return y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float inputNum = input.nextFloat();
        System.out.println("The inverse root is : " + Q_rsqurt(inputNum));
        float test = Q_rsqurt(inputNum);
        DecimalFormat df = new DecimalFormat("#,###.0000");
        df.format(test)
    }
}