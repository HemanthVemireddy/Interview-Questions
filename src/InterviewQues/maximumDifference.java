package InterviewQues;
public class maximumDifference {

    public static int findMaximumDifference(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Return a special value or throw an exception to indicate an error.
        }

        int minValue = arr[0];
        int maxDifference = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - minValue > maxDifference) {
                maxDifference = arr[i] - minValue;
            }

            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        return maxDifference;
    }
    public static void main(String[] args) {
        int[] inputArray = {23, 67, 1, 6, 97, 21, 7};
        int result = findMaximumDifference(inputArray);
        System.out.println("Maximum Difference: " + result);
    }
}

