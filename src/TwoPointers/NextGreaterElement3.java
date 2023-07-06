package TwoPointers;
import java.util.Arrays;
public class NextGreaterElement3 {
    public static void main(String[] args) {

        int n = 21;
        System.out.println(greaterElement(n));

    }
    static int greaterElement(int n) {

        int[] nums = converToArray(n);
        Arrays.sort(nums);

        int number = 0;
        for (int j=nums.length-1; j>=0; j--) {
            number = number * 10 + nums[j];
        }

        if (number > n && number <= Integer.MAX_VALUE) {
            return number;
        }
        return -1;
    }

    private static int[] converToArray(int n) {
        int count = countDigits(n);
        int[] nums = new int[count];
        int i = 0;
        while (n != 0) {
            int rem = n % 10;
            nums[i] = rem;
            i++;
            n = n/10;
        }
        return nums;
    }

    private static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n/=10;
            count++;
        }
        return count;
    }
}



//    public int nextGreaterElement(int n) {
//        int count = countDigits(n);
//        int[] nums = new int[count];
//
//        int i = 0;
//        while (n != 0) {
//            int rem = n % 10;
//            nums[i] = rem;
//            i++;
//            n = n/10;
//        }
//
//        Arrays.sort(nums);
//
//        int number = 0;
//        for (int j=nums.length-1; j>=0; j--) {
//            number = number * 10 + nums[j];
//        }
//
//        if (number > n && number <= Integer.MAX_VALUE) {
//            return number;
//        }
//        return -1;
//    }
//
//    private int countDigits(int n) {
//        int count = 0;
//        while (n != 0) {
//            n/=10;
//            count++;
//        }
//        return count;
//    }
