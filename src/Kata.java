// public class Kata {
//    public static String createPhoneNumber(int[] numbers) {
//        if (numbers.length != 10) {
//            return "Invalid input";
//        }
//
//        return String.format("%d%d%d-%d%d%d-%d%d-%d%d",
//                numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5],
//                numbers[6], numbers[7], numbers[8], numbers[9]);
//    }
//
//    public static void main(String[] args) {
//        int[] phoneNumber = {0,9,6,8,6,9,8,4,4,0};
//        String formattedPhoneNumber = createPhoneNumber(phoneNumber);
//        System.out.println(formattedPhoneNumber);  // Output: "(123) 456-7890"
//    }
//}

public class Kata {
    public static int findSmallestInt(int[] numbers) {
        int smallest = numbers[0]; // Початкове значення найменшого числа

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Оновлюємо значення найменшого числа
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] array1 = {134, 15, 88,32};
        int result1 = findSmallestInt(array1);
        System.out.println("Найменше число в масиві 1: " + result1);

        int[] array2 = {34,10, 10, 100};
        int result2 = findSmallestInt(array2);
        System.out.println("Найменше число в масиві 2: " + result2);

    }
}


