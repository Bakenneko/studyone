// public class Kata {
//    public static String createPhoneNumber(int[] numbers) {
//        if (numbers.length != 10) {
//            return "Invalid input";
//        }
//        return String.format("%d%d%d-%d%d%d-%d%d-%d%d",
//                numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5],numbers[6], numbers[7], numbers[8], numbers[9]);
//    }
//
//    public static void main(String[] args) {
//        int[] phoneNumber = {0,9,6,8,6,9,8,4,4,0};
//        String formattedPhoneNumber = createPhoneNumber(phoneNumber);
//        System.out.println(formattedPhoneNumber);  // Output: "(123) 456-7890"
//    }
//}
//import java.util.Arrays;
//public class DescendingDigitSorter {
//    public static int rearrangeDigitsDescending(int number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Input must be a non-negative integer");
//        }
//        String numberStr = Integer.toString(number); // Конвертуємо число у рядок
//        char[] digits = numberStr.toCharArray(); // Конвертуємо рядок у масив символів
//        Arrays.sort(digits); // Сортуємо символи у масиві у порядку спадання
//        reverseArray(digits);
//        return Integer.parseInt(new String(digits)); // Конвертуємо відсортований масив символів назад у ціле число
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
//public class Main {
//    public static void main(String[] args) {
//        String txt = "Hello\rWorld!";
//        System.out.println(txt);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        }
//        while (i < 5);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        String[] cars = {
//                "Volvo",
//                "BMW",
//                "Ford",
//                "Mazda"};
//        System.out.println(cars[0]);
//    }
//}
//public class Main {
//    static void myMethod(String name, int age) {
//        System.out.println(name + " is " + age);
//    }
//    public static void main(String[] args) {
//        myMethod("Liam", 5);
//        myMethod("Jenny", 8);
//        myMethod("Anja", 31);
//    }
//}
//Рекурсія
//public class Main {
//    public static void main(String[] args) {
//        int result = sum(10);
//        System.out.println(result);
//    }
//    public static int sum(int k) {
//        if (k > 0) return k + sum(k - 1);
//        else {
//            return 0;
//        }
//    }
//}
/*public class Main {
//    public static void main(String[] args) {
//        int result = sum(5, 10);
//        System.out.println(result);
//    }
//    public static int sum(int start, int end) {
//        if (end > start) {
//            return end + sum(start, end - 1);
//        } else {
//            return end;
//        }
//    }
//}

//Create an Object
//public class Main {
//   String x = "Honda" ;
//  public static void main(String[] args) {
//        Main myObj = new Main();
//        System.out.println(myObj.x);
//    }
//}

//public class Main {
//  int x = 5;
//
//  public static void main(String[] args) {
//    Main myObj1 = new Main();  // Object 1
//    Main myObj2 = new Main();  // Object 2
//    System.out.println(myObj1.x);
//    System.out.println(myObj2.x);
//  }
//} */
//public class Main {
//  int x = 5;
//}
//public class Main {
//    public static void main(String[] args) {
//        Person myObj = new Person();
//        myObj.setName("Ivan");
//        System.out.println(myObj.getName());
//
//
//    }
//}
//
//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//        String userName;
//
//        System.out.println("Enter username");
//        userName = myObj.nextLine();
//
//        System.out.println("Username is: " + userName);
//    }
//}
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Enter the number:");
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        for (int i = 1; i <= N; i++) {
//            // Перевірка, чи число непарне
//            if (i % 2 != 0)
//                System.out.println("Number is: " + i);
//        }
//    }
//}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();

        int[] euroBillsAndCoins = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        for (int billOrCoin : euroBillsAndCoins) {
            int count = sum / billOrCoin;
            System.out.println(count);
            sum %= billOrCoin;
        }
    }
}