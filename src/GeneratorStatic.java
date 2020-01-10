
import java.nio.charset.Charset;
import java.util.*;

public class GeneratorStatic {
    private static Random rand = new Random();

    public static void setRand(long seed){
        rand.setSeed(seed);
    }

    /**Function int getRandomString()
     * Return
     *
     * @return      random String with random length with maximum length 15
     */
    public static String getRandomString() {
        byte[] array = new byte[rand.nextInt(15)];
        rand.nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }

    /**Function int getRandomNumber
     * Return a random number
     *
     * @return      random number
     */
    public static int getRandomNumber() {
        return rand.nextInt();
    }

    /**Function int getRandomNumber(int)
     * Return a random number between 0 and the max setting (exclusive).
     *
     * @param max   maximal bound (exclusive)
     * @return      random number between 0 and the max
     */
    public static int getRandomNumber(int max) {
        return rand.nextInt(max);
    }

    GeneratorStatic() {}
}
