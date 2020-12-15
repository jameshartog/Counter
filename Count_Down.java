/**
 * Count Down from 0 to 7 and back down to 0 now utilizing Methods.
 *
 * @author (JJH)
 * @version (3.0)
 */
import java.util.Scanner;
public class Count_Down
{
    //Method
    public static int i;
    static void incre() {
        System.out.println(i);
        i++;
    }
    static void decre() {
        System.out.println(i);
        i--;
    }
    public static void main(String[] args)
    {
        System.out.print('\u000C');
        Scanner inp = new Scanner(System.in);
        int i = 0;
        System.out.print("What number do you want to count up and back to?");
        int g = inp.nextInt();
        for (int n = 0; n < g; n++) {
            incre();
        }
        for (int n = g; n > -1; n--) {
            decre();
        }
    }
}