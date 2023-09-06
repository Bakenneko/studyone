////public class Kata {
////    public static String createPhoneNumber(int[] numbers) {
////        if (numbers.length != 10) {
////            return "Invalid input";
////        }
////
////        return String.format("%d%d%d-%d%d%d-%d%d-%d%d",
////                numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5],
////                numbers[6], numbers[7], numbers[8], numbers[9]);
////    }
////
////    public static void main(String[] args) {
////        int[] phoneNumber = {0,9,6,8,6,9,8,4,4,0};
////        String formattedPhoneNumber = createPhoneNumber(phoneNumber);
////        System.out.println(formattedPhoneNumber);  // Output: "(123) 456-7890"
////    }
////}
//import java.util.Arrays;
//public class DescendingDigitSorter {
//    public static int rearrangeDigitsDescending(int number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Input must be a non-negative integer");
//        }
//        // Конвертуємо число у рядок
//        String numberStr = Integer.toString(number);
//        // Конвертуємо рядок у масив символів
//        char[] digits = numberStr.toCharArray();
//        // Сортуємо символи у масиві у порядку спадання
//        Arrays.sort(digits);
//        reverseArray(digits);
//        // Конвертуємо відсортований масив символів назад у ціле число
//        return Integer.parseInt(new String(digits));
//    }
//
//    public static void reverseArray(char[] arr) {
//        //Цей метод використовується для перевертання масиву символів. Він використовує два вказівника (left і right),
//        //які починають рухатися назустріч один одному, обмінюючи значення символів місцями до тих пір, поки вони не зустрінуться.
//        int left = 0;
//        int right = arr.length - 1;
//        while (left < right) {
//            char temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//    }
//
//    public static void main(String[] args) {
//        int number = 8165946;
//        int result = rearrangeDigitsDescending(number);
//        System.out.println("Original number: " + number);
//        System.out.println("Number with digits rearranged in descending order: " + result);
//    }
//}





