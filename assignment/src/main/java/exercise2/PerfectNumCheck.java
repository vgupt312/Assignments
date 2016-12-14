package exercise2;

/**
 * @author vgup77
 *
 */
public class PerfectNumCheck {

    /**
     * @param number
     * @return
     */
    public static boolean perfectNumberCheck(final int number) {
        int temp = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                temp += i;
            }
        }
        if (number != 0 && temp == number)
            return true;

        return false;
    }
}
