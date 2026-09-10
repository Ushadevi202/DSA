class Minimum {
    public static void main(String[] args) {

        int[] nums = {5, 0, 1, 4, 2, 3};

        int min = Integer.MAX_VALUE;

        for (int j = 0; j < nums.length; j++) {
            if (min > nums[j]) {
                min = nums[j];
            }
        }

        System.out.println("Minimum: " + min);
    }
}