public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        if (numbers.length != 10) {
            return "Invalid input";
        }

        return String.format("%d%d%d-%d%d%d-%d%d-%d%d",
                numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5],
                numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static void main(String[] args) {
        int[] phoneNumber = {0,9,6,8,6,9,8,4,4,0};
        String formattedPhoneNumber = createPhoneNumber(phoneNumber);
        System.out.println(formattedPhoneNumber);  // Output: "(123) 456-7890"
    }
}
