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
//
//interface Animal { }
//
//class Pig implements Animal {
//    public void animalSound() {
//        System.out.println("The pig says: wee wee");
//    }
//    public void sleep() {
//        System.out.println("Zzz");
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Pig myPig = new Pig();
//        myPig.animalSound();
//        myPig.sleep();
//    }
//}
//public class Main {
//    enum Level {
//        LOW, MEDIUM, HIGH
//    }
//    public static void main(String[] args) {
//        Level myLvl = Level.MEDIUM;
//        System.out.println(myLvl);
//
//        for (Level myLvl1 : Level.values()) {
//            System.out.println(myLvl1);
//        }
//    }
//}
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter name, age and salary:");
//        String name = myObj.nextLine();
//        int age = myObj.nextInt();
//        double salary = myObj.nextDouble();
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);
//    }
//}
//import java.time.LocalDate; // import the LocalDate class
//public class Main {
//    public static void main(String[] args) {
//        LocalDate myObj = LocalDate.now(); // Create a date object
//        System.out.println(myObj); // Display the current date
//    }
//}
//import java.time.LocalTime; // import the LocalTime class
//public class Main {
//    public static void main(String[] args) {
//        LocalTime myObj = LocalTime.now();
//        System.out.println(myObj);
//    }
//}

//import java.time.LocalDateTime;
//public class Main{
//    public static void main(String[] args) {
//        LocalDateTime myTime = LocalDateTime.now();
//        System.out.println(myTime);
//    }
//}
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class Main {
//    public static void main(String[] args) {
//        LocalDateTime myDateObj = LocalDateTime.now();
//        System.out.println("Before formatting: " + myDateObj);
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
//        String formattedDate = myDateObj.format(myFormatObj);
//        System.out.println("After formatting: " + formattedDate);
//    }
//}
//* import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNum = new ArrayList<>();
//        myNum.add(1);
//        myNum.add(3);
//        myNum.add(5);
//        myNum.add(7);
//        myNum.add(9);
//        myNum.add(11);
//        myNum.add(13);
//        for (int i : myNum) {
//            System.out.println(i);
//        }
//    }
//}
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Dodge");
//        cars.add("BMW");
//        cars.add("Cadillac");
//        cars.add("Shelby");
//        cars.add("Mazda");
//        cars.add("Toyota");
//        cars.add("Opel");
//        Collections.sort(cars);
//        for (String i : cars) {
//            System.out.println(i);
//        }
//    }
//}
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNum = new ArrayList<>();
//        myNum.add(8);
//        myNum.add(28);
//        myNum.add(81);
//        myNum.add(38);
//        myNum.add(80);
//        myNum.add(48);
//        myNum.add(808);
//        myNum.add(118);
//        myNum.add(18);
//        Collections.sort(myNum);
//        for (int i : myNum) {
//            System.out.println(i);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int numberOfWheels = getNumber(a, b);
//        System.out.println(numberOfWheels);
//    }
//
//    public static int getNumber(int a, int b) {
//        return 2 * a + 4 * b;
//    }
//
//}
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(findNb(1071225)); // Виведе 45
//        System.out.println(findNb(91716553919377L)); // Виведе -1
//    }
//
//    public static long findNb(long m) {
//        long sum = 0;
//        long n = 1;
//
//        while (sum < m) {
//            sum += n * n * n;
//            if (sum == m) {
//                return n;
//            }
//            n++;
//        }
//
//        return -1;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Box<Integer> intBox = new Box<>(42);
//        Box<String> strBox = new Box<>("Hello, Generics!");
//
//        int intValue = intBox.getData();
//        String strValue = strBox.getData();
//
//        System.out.println(intValue); // 42
//        System.out.println(strValue); // Hello, Generics!
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner read = new Scanner(System.in);
//
//        System.out.print("Enter First Name: ");
//        String firstName = read.nextLine();
//
//        System.out.print("Enter Second name: ");
//        String secondName = read.nextLine();
//
//        System.out.print("Enter age: ");
//        int age = read.nextInt();
//
//        System.out.print("Enter room number: ");
//        int roomNumber = read.nextInt();
//
//        Customer customer = new Customer();
//        customer.firstName = firstName;
//        customer.secondName = secondName;
//        customer.age = age;
//        customer.roomNumber = roomNumber;
//
//        customer.saveCustomerInfo();
//    }
//}
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = read.nextLine();
        System.out.println("Enter age: ");
        int age = read.nextInt();
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}