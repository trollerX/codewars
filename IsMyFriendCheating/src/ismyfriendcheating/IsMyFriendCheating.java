package ismyfriendcheating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author TrollerX
 */
public class IsMyFriendCheating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(removNb(26));
    }

    public static List<long[]> removNb(long n) {
        List<long[]> result = new ArrayList<long[]>();
        List<Long> seq = sequence(n);
        List<long[]> comb = combinations(seq, 2);
        System.out.println(comb.size());
        
//        System.out.print("Combinations:");
//        for(long[] arr : comb){
//            System.out.println(arr.toString() + ", ");
//        }

        for (long[] arr : comb) {
            long product = product(arr);
            long sum = sum(removeElement(comb, comb.indexOf(arr)));
            if (product == sum) {
                result.add(arr);
                break;
            }
        }
        return result;
    }

    public static List<Long> sequence(long n) {
        ArrayList<Long> seq = new ArrayList<Long>();
        for (long i = 1; i <= n; i++) {
            seq.add(i);
        }
        return seq;
    }

    public static long product(long[] arr) {
        return arr[0] * arr[1];
    }

    public static long sum(List<long[]> arr) {
        long sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < 2; j++) {
                sum += arr.get(i)[j];
            }
        }
        return sum;
    }

    public static List<long[]> removeElement(List<long[]> arrays, long i) {
        List<long[]> newArr = new ArrayList<>();
        for (long[] arr : arrays) {
            if (!(arrays.indexOf(arr) == i)) {
                newArr.add(arr);
            }
        }
        return newArr;
    }

    public static List<long[]> combinations(List<Long> seq, int n) {
        List<long[]> comb = new ArrayList<>();
        for (int i = 0; i < seq.size() - 2; i++) {
            for (int j = i + 1; j < seq.size() - 1; j++) {
                long[] pair = new long[]{seq.get(i), seq.get(j)};
                comb.add(pair);
            }
        }
        return comb;
    }
}
