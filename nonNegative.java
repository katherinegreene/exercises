/*write a orıgram to move all non negative elements to the start of the array
input:{-1,-20,30,40,50,-8
output{-1,-20,-8,30,40,50}} */
import java.util.Arrays;

public class  nonNegative{
    static void arrange(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            // move low forward if element is negative
            while (low < high && arr[low] < 0) {
                low++;
            }

            // move high backward if element is positive
            while (low < high && arr[high] >= 0) {
                high--;
            }

            // swap
            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, -20, 30, 40, 50, -8};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}