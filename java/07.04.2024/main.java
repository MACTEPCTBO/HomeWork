import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        float a = 2.3f;
        float x = 0f;
        float step = 0.2f;

        while (x < 2.8) {
            //System.out.println(x);

            if (x < 1)
                System.out.println(1.5 * Math.pow(Math.cos(x),2));
            else if (x == 1)
                System.out.println(1.8*a*x);
            else if (1 < x && x < 2)
                System.out.println(Math.pow((x-2),2) + 6);
            else if (x > 2)
                System.out.println(3 * Math.tan(x));

            x += step;
            }


        }
}
