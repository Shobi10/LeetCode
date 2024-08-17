class Solution {
    public String largestNumber(int[] nums) {
        // Convert the integer array to a string array
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Bubble sort implementation to sort based on custom comparator logic
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                String order1 = arr[j] + arr[j + 1];
                String order2 = arr[j + 1] + arr[j];
                // Compare the two concatenated strings and swap if necessary
                if (order2.compareTo(order1) > 0) {
                    // Swap arr[j] and arr[j + 1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // If the largest element is "0", return "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build the largest number by concatenating the strings in the array
        StringBuilder largestNumber = new StringBuilder();
        for (String num : arr) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }
}
