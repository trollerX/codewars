package aretheythesame;

import java.util.Arrays;

/**
 *
 * @author TrollerX
 */
public class AreTheyTheSame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
//        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 36100, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
    }

    public static boolean comp(int[] a, int[] b) {
        return a != null && b != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
//        if (a == null || b == null) {
//            return false;
//        }
//        if (a.length == 0 || b.length == 0) {
//            return false;
//        }
//        Arrays.sort(b);
//        for (int i = 0; i < a.length; i++) {
//            int index = Arrays.binarySearch(b, a[i] * a[i]);
//            if (index < 0) {
//                return false;
//            }
//        }
//        return true;
    }

}
