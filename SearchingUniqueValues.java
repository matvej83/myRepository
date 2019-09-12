import java.util.Arrays;

public class SearchingUniqueValues {
    public static void main(String[] args) {
        //int[] arr = {1, 23, 45, 2, 4, 2, 56, 2, 23};
        int[] arr = {1, 4, 5, 1, 1, 3};
        Arrays.sort(arr);
        int counter = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                counter++;
            }
        }
        System.out.println("The number of unique values is " + counter);
    }
}
