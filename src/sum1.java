public class sum1 {
    public static void main(String[] args) {
        // Test cases
        System.out.println(sumWithoutTwelve(1, 2, 3));    // Output: 6
        System.out.println(sumWithoutTwelve(12, 2, 3));   // Output: 3
        System.out.println(sumWithoutTwelve(5, 12, 3));   // Output: 5
        System.out.println(sumWithoutTwelve(5, 6, 12));   // Output: 11
        System.out.println(sumWithoutTwelve(5, 12, 12));  // Output: 5
        System.out.println(sumWithoutTwelve(12, 12, 3));  // Output: 3
    }

    public static int sumWithoutTwelve(int... nums) {
        int sum = 0;
        boolean encounteredTwelve = false;

        for (int num : nums) {
            if (num == 12) {
                encounteredTwelve = true;
            } else if (!encounteredTwelve) {
                sum += num;
            }
        }

        return sum;
    }
}