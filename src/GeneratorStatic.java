import java.nio.charset.Charset;
import java.util.*;

public class GeneratorStatic {
    private Random rand = new Random();

    public void setRand(long seed){
        rand.setSeed(seed);
    }

    /**Function int getRandomString()
     * Generate a random String with maximum length of 15
     *
     * @return      random String with random length with maximum length 15
     */
    public String getRandomString() {
        byte[] array = new byte[rand.nextInt(15)];
        rand.nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }

    /**Function int getRandomNumber
     * Generate a random number
     *
     * @return      random number
     */
    public int getRandomNumber() {
        return rand.nextInt();
    }

    /**Function int getRandomNumber(int)
     * Generate a random number between 0 and the max setting (exclusive).
     *
     * @param max   maximal bound (exclusive)
     * @return      random number between 0 and the max
     */
    public int getRandomNumber(int max) {
        return rand.nextInt(max);
    }

    GeneratorStatic(){}

    GeneratorStatic(long seed){
        this.setRand(seed);
    }
}
