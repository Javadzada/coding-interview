package codingSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.sl.In;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Coding {

    @Given("Even - Odd")
    public void even_Odd() {
        //*************MAIN METHOD*************************

        int num = 5;

        // Option 1 : If-else-statement
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
//

//        Options 2 : Ternary Operator
//        System.out.println(num % 2 == 0 ? num + " is even" : num + " is odd");


        //**********************************End********************************************


        //***************METHOD************************


//        public static void evenOrOdd (int num){
//            if (num % 2 == 0) {
//                System.out.println(num + " is even");
//            } else {
//                System.out.println(num + " is odd");
//            }
//        }
//    }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Print Alphabet")
    public void print_Alphabet() {
        //*************MAIN METHOD*************************

        char ch;
        for( ch = 'a' ; ch <= 'z' ; ch++ ){
            System.out.println(ch);
        }

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Swap Numbers")
    public void swap_Numbers() {
        //*************MAIN METHOD*************************

        int a = 5;
        int b = 10;

        a = a + b; // 5 + 10 = 15 --> New Value for a
        b = a - b; // 15 - 10 = 5 --> New value for b
        a = a - b; // 15 - 5 = 10 --> New value for a

        //OPTION 2 w/t TEMP VARIABLE
//        int temp = a;
//        a = b;
//        b = temp;


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Reverse String")
    public void reverse_String() {
        //*************MAIN METHOD*************************

        //Option 1
        String str = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }



        //**********************************End********************************************


        //***************METHOD************************

//        public static String reverseString (String str){
//            String reverse = "";
//            for (int i = str.length() - 1; i >= 0; i--) {
//                reverse += str.charAt(i);
//            }
//            return reverse;
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Reverse Number")
    public void reverse_Number() {
        //*************MAIN METHOD*************************

        //Option 1 : Using String.valueOF() & Integer.parseInt()

        int num = 123;

        String number = String.valueOf(num); //Change int into String

        String reverseNumber = ""; //Empty String to put the reverse Number

        for (int i = number.length() - 1; i >= 0; i--) { // Start from the last index and work your way down
            reverseNumber += number.charAt(i);
        }

        int reverseNum = Integer.parseInt(reverseNumber); //Change String into int

        System.out.println(reverseNum);

//        // Option 2: Using a While Loop
//
//        int num = 123;
//        int reversed = 0;
//        while (num != 0) {// If number is not 0 (zero) go inside the loop --> 123 is not 0
//            int remainder = num % 10;// value is the remainder of the number --> 123 / 10 = 3 (is the remainder)
//            reversed = reversed * 10 + remainder;  // reverse NEW value is this calculation --> (0 * 10) + 3 = 3
//            num /= 10; // num NEW value --> 123 / 10 = 12   *It is an integer so NO decimals
//            // REPEAT until num value is 0 (zero)
//        }
//
//        System.out.println("Reversed Number: " + reversed);


        //**********************************End********************************************


        //***************METHOD************************

//    public static int reverseNumber(int num) {
//        int reversed = 0;
//        while (num != 0) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//            num /= 10;
//        }
//        return reversed;
//    }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Prime Number")
    public void prime_Number() {
        //*************MAIN METHOD*************************

        //What is a prime number?
        //It is a number that is divided by 1 and itself
        //Ex. 1, 2, 3, 5, 7, ...
        // 3/1 = 3 (Whole number) *A whole number that does not have decimals
        // 3/3 = 1 (Whole number)
        //Divided ONLY Twice in a WHOLE number --That is it
        //If divided more than twice it NOT a prime number

        int num = 5;
        boolean isPrime = true; //Trying to prove it NOT a Prime Number
        for (int i = 2; i < num; ++i) { //Start with 2 b/c ALL numbers can be divided by 1(one)
            //Using Less than b/c we are using ALL numbers EXCEPT itself
            if (num % i == 0) {//ANY numbers in between 1 and itself are divisible then it is false
                isPrime = false;
                break; //No need to keep checking, That is why we break
            }
        }

        //Option 1 : If-else-statement

        if (isPrime) //If True then it will not Enter into the body
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        //Option 2 : Ternary Operator

//      System.out.println(isPrime ? num + " is a prime number" : num + " is not a prime number");


        //**********************************End********************************************


        //***************METHOD************************

//        public static boolean isPrime( int num){
//
//        boolean isPrime = false;
//        for (int i = 2; i <= num / 2; ++i) {
//            // condition for nonprime number
//            if (num % i == 0) {
//                isPrime = true;
//                break;
//            }
//        }
//            return isPrime;
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("String Palindrome")
    public void string_Palindrome() {
        //*************MAIN METHOD*************************

        String word = "mom";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i); //Reverse the word / concatenate into reverse string
        }

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("The word is palindrome");
        } else {
            System.out.println("The word is NOT a palindrome");
        }

//       // Options 2 : Ternary Operator

//       System.out.println(word.equalsIgnoreCase(reverse) ? "The word is Palindrome" : "The word is NOT a Palindrome");


        //**********************************End********************************************


        //***************METHOD************************

//        public static boolean palindrome(String word){
//            boolean isPalindrome = false;
//            String reverse="";
//            for (int i = word.length() - 1; i >= 0; i--) {
//                reverse += word.charAt(i);
//            }
//            if (word.equalsIgnoreCase(reverse)) {
//                isPalindrome = true;
//            }
//            return isPalindrome;
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Number Palindrome")
    public void number_Palindrome() {
        //*************MAIN METHOD*************************

       //Option 1: Converting int into String.valueOf()

        int num = 121;

        String numStr = String.valueOf(num);

        String numReverse = "";

        for (int i = numStr.length() - 1; i >= 0; i--) {

            numReverse += numStr.charAt(i);
        }

        if (numStr.equals(numReverse)) {

            System.out.println("Number is a palindrome");

        } else {

            System.out.println("Number is NOT a palindrome");

        }


//        //Option 2: With a While loop

//        int num = 911;
//        int palindrome = num; // First, Need to put num into new variable b/c it is going to change values in the while loop
//        int reversed = 0; // Second, We need to reverse the number
//        while (num != 0) {// If number is not 0 (zero) go inside the loop --> 123 is not 0
//            int remainder = num % 10;// value is the remainder of the number --> 123 / 10 = 3 (is the remainder)
//            reversed = reversed * 10 + remainder;  // reverse NEW value is this calculation --> (0 * 10) + 3 = 3
//            num /= 10; // num NEW value --> 123 / 10 = 12   *It is an integer so NO decimals
//            // REPEAT until num value is 0 (zero)
//        }
//
//        if (palindrome == reversed) {
//            System.out.println("Number is a palindrome");
//        } else {
//            System.out.println("Number is NOT a palindrome");
//        }





        //**********************************End********************************************


        //***************METHOD************************

//    public static boolean numberPalindrome(int num) {
//        boolean isPalindrome = false;
//        int palindrome = num;
//        int reverse = 0;
//        while (palindrome != 0) {
//            int remainder = palindrome % 10;
//            reverse = reverse * 10 + remainder;
//            palindrome = palindrome / 10;
//        }
//        if (num == reverse) {
//            isPalindrome = true;
//        }
//        return isPalindrome;
//    }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Factorial")
    public void factorial() {
        //*************MAIN*************************

        //What is factorial ?
        //The product (multiplication) of ALL Positive integers
        //Ex. 5! --> 1*2*3*4*5

        int num = 4;
        int factorialSum = 1;
        for (int i = 2; i <= num; i++) { //No need to start w/t ONE --> One times a number is itself (DOES NOT change)
            factorialSum = factorialSum * i;
//            factorialSum *= i;
        }

        System.out.println("Factorial of " + num + " is " + factorialSum);


        //**********************************End********************************************


        //***************METHOD************************

//       public static int factorial(int num){
//            int factorialSum = 1;
//            for (int i = 1; i <= num; i++) {
//                factorialSum = factorialSum * i;
//            }
//            return factorialSum;
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Sum Of Numbers - Digits")
    public void sum_Of_Digits() {
        //*************MAIN*************************


//        // Option 1: Using String Arr / String.valuseOf().split("")

        int num = 123;
        //String.valueOf -> Converts int into String
        //Split -> splits it into an array
        String[] arr = String.valueOf(num).split("");

        int sum = 0;

        for (String s : arr) {
            //Integer.parseInt -> Converts String into Integer
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);

        //Option 2: Using While Loop

//        int num = 123;
//        int sum = 0;
//        while (num > 0) {
//            sum += num % 10; //Adding the Remainders --> 123 % 10 = 3
//            num = num / 10; //Change num value --> 123 / 10 = 12
//            //Repeat until 0
//        }
//        System.out.println(sum);

        //**********************************End********************************************


        //***************METHOD************************

//        public static int sumOfDigits(int num){
//            int sum = 0;
//            while (num > 0) {
//                sum += num % 10;
//                num = num / 10;
//            }
//            return sum;
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Sum of Numbers - Digits in a String with Letters Java{int}k -> {int}")
    public void sum_of_Numbers_Digits_in_a_String_with_Letters_Java_k(Integer int1, Integer int2) {
        //*************MAIN*************************

        String str = "We all are going to make 150k 150k 150k 150k";

        int sum = 0;

        char[] arr = str.toCharArray();

        for (char c : arr) {

            if (Character.isDigit(c)) {

                sum += Character.getNumericValue(c);

            }
        }

        System.out.println("The sum is " + sum);

            //**********************************End********************************************

    } //DO NOT COPY

    @Given("Fibonacci")
    public void fibonacci() {
        //*************MAIN*************************

        //What is Fibonacci Sequence
        //A series of numbers in which each number is the sum of the two preceding numbers.
        // The simplest is the series 1, 1, 2, 3, 5, 8, etc.
        //0 + 1 = 1
        //1 + 1 = 2
        //1 + 2 = 3


//        int num1 = 0, num2 = 1, max = 10; //Initialize on ONE line

//        int num 1 = 0, num2 = 0 , max = 25;

        int num1 = 0; // first number is 0

        int num2 = 1; // 2nd number is 1

        int max = 10; // Sequence -> Prints 10 number sequence

        for (int i = 0; i < max; i++) {

            System.out.print(num1 + " "); //Print num1

            int sum = num1 + num2; // sum will give us next number in the line

            num1 = num2; // Change the value for num1 to num2

            num2 = sum; // Change the value for num2 to sum

            //Repeat itself until max range number

        }



        //Option 2: Sprints up to 100

//        int num=0;
//        System.out.print(num+" ");
//        for(int i=1; i<100; i=num-i){
//
//            if(num+i<100){
//
//                System.out.print(num+i+" ");
//
//                num+=i;}
//
//            else break;
//        }



        //**********************************End********************************************


        //***************METHOD************************

//        public static void fibonacci(int max) {
//            int num1 = 0; // first number is 0
//
//            int num2 = 1; // 2nd number is 1
//
//            for (int i = 0; i < max; i++) {
//
//                System.out.print(num1 + " ");
//
//                int sum = num1 + num2; // sum will give us next number in the line
//
//                num1 = num2; // 1 , 1, 2, 3, 5, 8, 13, 21
//
//                num2 = sum; //1 , 2, 3, 5, 8, 13, 21, 34
//
//            }
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Are there Duplicate Numbers in the Array")
    public void are_there_Duplicate_Numbers_in_the_Array() {
        //*************MAIN*************************

        //Are there duplicates in the Array?

        int[] arr = {1, 2, 3, 3};
        boolean duplicate = false; //Trying to prove iT DOES not have duplicates
        for (int j = 0; j < arr.length; j++) { // j's value (index 0) = 1 (Changes value after inner loop is complete)
            for (int k = j + 1; k < arr.length; k++) {  // k's value is always one ahead b/c you don't want to check itself
                // k value (index 1) = 2; (Start at index 1 and move forward)
                if (arr[j] == arr[k]) { //If any values are equal to each other than it is true
                    duplicate = true;
                    break; //No neec to check further. Exit the loop
                }
            }
        }

        //Option 1 : If-else-Statement

        if (duplicate) {
            System.out.println("Array has duplicates");
        } else {
            System.out.println("Does not have duplicates");
        }

        //Option 2 : Ternary Operator

//        System.out.println(duplicate ? "Array has duplicates" : "Does not have duplicates");


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Find Duplicate Numbers and Print Each One")
    public void find_Duplicate_Numbers_and_Print_Each_One() {
        //*************MAIN*************************

        //Print EACH duplicate
        int[] arr = {1, 35, 2, 3, 5, 2, 2, 3};
        int count = 0; //Counter variable
        for (int j = 0; j < arr.length; j++) { // j's value (index 0) = 1 (Changes value after inner loop is complete)
            for (int k = j + 1; k < arr.length; k++) {  // k's value is always one ahead b/c you don't want to check itself
                // k value (index 1) = 2; (Start at index 1 and move forward)
                if (arr[j] == arr[k]) { //If any values are equal to each othe
                    count++; //Add one to the counter variable
                }
            }
            if (count == 1)//Equals to one b/c you want to print the duplicates once
                System.out.println(arr[j]);
            count = 0; //Reset the value
        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("FizzBuzz")
    public void fizzbuzz() {
        //*************MAIN METHOD*************************

        for (int i = 1; i <= 50; i++) {
            if (i % (5 * 3) == 0) { //Antyhing divisible by 15
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        //***************METHOD************************

//    public static void fizzBuzz(int num) {
//        for (int i = 1; i <= num; i++) {
//            if (i % (5 * 3) == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Only Unique - Distinct Letters")
    public void only_Unique_Distinct_Letters() {
        //*************MAIN*************************

        String str = "aaaaddddcc";
        str = str.replace(" ", "").toLowerCase();
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains("" + str.charAt(i))) {//unique DOES NOT contain any letters in the String than ADD it
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);

        //***************METHOD************************

//        public static String uniqueChars(String str){
//            String unique = "";
//            for (int i = 0; i < str.length(); i++) {
//                if (!unique.contains("" + str.charAt(i))) {
//                    unique += str.charAt(i);
//                }
//            }
//            return unique;
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Largest Number in Array")
    public void largest_Number_in_Array() {
        //*************MAIN*************************

        //Optoin 1 : With Sort

        int[] arr = {5, 6, 76, 31, 43, 1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);

        //OPTION 2 without SORT

//        int[] arr = {5, 6, 76, 31, 43, 1};
//        int largestNum = arr[0]; //Start with the first value of the array (Zero index)
//        for(int i = 1; i<arr.length; i++ ) { //Start with the second value of array (first index) b/c first value is CURRENT largestNum
//            if (arr[i] > largestNum) { //If the value of array is larger THAN enter
//                largestNum = arr[i];//Change current value into new value
//            }
//        }
//        System.out.println(largestNum);


        //***************METHOD************************

        //OPTION 1 w/t SORT

//        public static int largestNumber (int[] arr){
//            Arrays.sort(arr);
//            return arr.length-1;
//        }

        //OPTION 2 without SORT

//        public static int largestNumber(int[]arr){
//            int largestNum = arr[0];
//            for (int i = 1; i < arr.length; i++) {
//                if (arr[i] > largestNum) {
//                    largestNum = arr[i];
//                }
//            }
//            return largestNum;
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Smallest Number in Array")
    public void smallest_Number_in_Array() {
        //*************MAIN*************************

        //Option 1 : with SORT

        int[] arr = {5, 6, 76, 31, 43, 1};
        Arrays.sort(arr);
        System.out.println(arr[0]);

        //Option 2:  without SORT

        //        int[] arr = {5, 6, 76, 31, 43, 1};
//        int smallestNumber = arr[0]; //Start with the first value of the array(Zero Index)
//        for(int i = 1; i<arr.length; i++ ) { //Start with the second value of array(first index) b/c first value is CURRENT smallestNumber
//            if (arr[i] < smallestNumber) { //If the value of array is smaller THAN enter
//                smallestNumber = arr[i]; //Change current value into new value
//            }
//        }
//        System.out.println(smallestNumber);

        //***************METHOD************************

        //OPTION 1 w/t SORT

//        public static int smallestNumber (int[] arr){
//            Arrays.sort(arr);
//            return arr[0];
//        }

        //OPTION 2 without SORT

//        public static int smallestNumber(int[]arr){
//            int smallestNumber = arr[0];
//            for (int i = 1; i < arr.length; i++) {
//                if (arr[i] < smallestNumber) {
//                    smallestNumber = arr[i];
//                }
//            }
//            return smallestNumber;
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Armstrong Number")
    public void armstrong_Number() {
        //*************MAIN*************************

        // This program computes all Armstrong numbers in the range of 0 and 999.
        // An Armstrong number is a number such that the sum
        // of its digits raised to the third power is equal to the number itself.
        // For example, 371 is an Armstrong number, since
        // 3*3*3 + 7*7*7 + 1*1*1 = 371.
        //  27   +  343  + 1     = 371

        int num = 370;
        int temp = num; //num is going to change so this will keep the whole number
        int remainder;
        int sum = 0;

        while (num != 0) {
            remainder = num % 10; //Getting the reminader
            sum += remainder * remainder * remainder; // Cube the remainder and ADD it to the sum
            num = num / 10; //get new num
            //Repeat
        }

        //Option 1 : If-Else-Statement
        if (temp == sum) {
            System.out.println("This is an Armstrong number");
        } else {
            System.out.println("This is not an Armstrong number");
        }

        //Option 2 : Ternary Operator

//        System.out.println(temp == sum ? "This is an Armstrong Number" : "This is not an Armstrong Number");


        //***************METHOD************************

//        public static void armstrongNumber(int num){
//        int temp = num; //num is going to change so this will keep the whole number
//        int remainder;
//        int sum = 0;
//
//        while (num != 0) {
//            remainder = num % 10; //Getting the reminader
//            sum += remainder * remainder * remainder; // Cube the remainder and ADD it to the sum
//            num = num / 10; //get new num
//            //Repeat
//        }
//
//        //Option 1 : If-Else-Statement
//        if (temp == sum) {
//            System.out.println("This is an Armstrong number");
//        } else {
//            System.out.println("This is not an Armstrong number");
//        }
//     }

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Anagram")
    public void anagram() {
        //*************MAIN METHOD*************************

        String word1 = "as4f";
        String word2 = "asdf";

        String word_1 = word1.replace(" ", "").toLowerCase();
        String word_2 = word2.replace(" ", "").toLowerCase();

        char[] str1 = word_1.toCharArray();
        char[] str2 = word_2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        //Option 1 : If-else-statements
        if (Arrays.equals(str1, str2)) {
            System.out.println("Is a anagram");
        } else {
            System.out.println("Is NOT a anagram");
        }

        //Option 2 : Ternary Operator
//        System.out.println(Arrays.equals(str1,str2) ? "Is a anagram" : "Is NOT a anagram");

        //***************METHOD************************

//        public static boolean isAnagram(String word1, String word2) {
//
//            boolean anagram = false;
//
//            String word_1 = word1.replace(" ", "").toLowerCase();
//            String word_2 = word2.replace(" ", "").toLowerCase();
//
//            char[] str1 = word_1.toCharArray();
//            char[] str2 = word_2.toCharArray();
//
//            Arrays.sort(str1);
//            Arrays.sort(str2);
//
//            if (Arrays.equals(str1, str2)) {
//                anagram = true;
//            }
//
//            return anagram;
//
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Count Letters in a String")
    public void count_Letters_in_a_String_Duplicate_Characters_in_String() {

        //*************MAIN METHOD*************************

        //OPTION 1

        String str = "Betty Bought a piece of Butter and the Butter was so Bitter";
        str = str.replace(" ", "").toLowerCase();
        String uniques = "";
        for (char letter : str.toCharArray()) {
            if (!uniques.contains("" + letter)) {
                uniques += letter;
            }
        }
        for (int i = 0; i < uniques.length(); i++) {
            String letter = "" + uniques.charAt(i); // r
            int counter = 0;
            for (int k = 0; k < str.length(); k++) {
                if (letter.equals("" + str.charAt(k))) {
                    counter++; // 0
                }
            }
            System.out.println(letter + " - " + counter);
        }

//***************METHOD************************

        //OPTION 1

//        public static void duplicateCharacter(String str) {
//            String uniques = "";
//            for (char letter : str.toCharArray()) {
//                if (!uniques.contains("" + letter)) {
//                    uniques += letter;
//                }
//            }
//            for (int i = 0; i < uniques.length(); i++) {
//                String letter = "" + uniques.charAt(i); // r
//                int counter = 0;
//                for (int k = 0; k < str.length(); k++) {
//                    if (letter.equals("" + str.charAt(k))) {
//                        counter++; // 0
//                    }
//                }
//                System.out.println(letter + " - " + counter);
//            }
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Convert String to Array")
    public void convert_String_to_Array() {
        //*************MAIN METHOD*************************

        String str = "YollAcademy";
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));

        //PRINTS out EACH SINGLE CHARACTER in the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //***************METHOD************************

//        public static char[] convertStringToArray(String str) {
//            char[] arr = str.toCharArray();
//            return arr;
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Count Specific Characters in given String")
    public void count_Specific_Characters_in_given_String() {
        //*************MAIN METHOD*************************

        String str = "aaddcccc";
        char val = 'c';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == val) {
                count++;
            }
        }
        System.out.println(val + ": " + count);

        //***************METHOD************************

//        public static void charCount(String str, char val) { //OUTPUT (t:2)
//            int count = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == val) {
//                    count++;
//                }
//            }
//            System.out.println(val + ": " + count);
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Smallest Difference in the Array")
    public void smallest_Difference_in_the_Array() {
        //*************MAIN METHOD*************************

        int[] arr = new int[]{2, 1, 6, 8, 10, 89, 54};
        Arrays.sort(arr);
        int difference = arr[arr.length - 1];
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            if (difference > (arr[i + 1] - arr[i])) {
                difference = arr[i + 1] - arr[i];
            }
        }
        System.out.println(difference);


        //*********END***********************************************

    } //DO NOT COPY


    @Given("Sort Array without using Array Sort")
    public void sort_Array_without_using_Array_Sort() {

        //*************MAIN METHOD*************************

        int[] arr = new int[]{6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        //Print the Array
        System.out.println(Arrays.toString(arr));


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Reverse Each Word in the Sentence")
    public void reverse_Each_Word_in_the_Sentence() {
        //*************MAIN METHOD*************************

        String str = "We are going to make 150k 150k 150k";

        String[] arr = str.split("\\s"); // "\\s" is the same as " "

        for (int i = 0; i < arr.length; i++) {

            String reverseWord = "";

            for (int j = arr[i].length() - 1; j >= 0; j--) {

                reverseWord += arr[i].charAt(j);

            }

            if (i < arr.length - 1) {
                //Prints Each Space
                System.out.print(reverseWord + " ");

            } else { // Does NOT print out Last space

                System.out.print(reverseWord);

            }

        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Find the FIRST non repeated Letter or Character in the String abcab -> c")
    public void find_the_FIRST_non_repeated_Letter_or_Character_in_the_String_abcab_c() {
        //*************MAIN METHOD*************************

        String str = "we are gwoing to make 150k 150k 150k";

        for (int i = 0; i < str.length(); i++) {

            //We are using indexOf b/c we are trying to find a MATCH in the Characters

            if (str.indexOf(str.charAt(i), str.indexOf(str.charAt(i)) + 1) == -1) { //-1 means that there is no MATCH

                System.out.println("First non-repeating character is " + str.charAt(i));

                break;

            }

        }

        //*************END*************************

    } //DO NOT COPY

    @Given("Add the count to the end of each character in consecutive order aaccbbaaa -> a{int}c{int}b{int}a{int}")
    public void add_the_count_to_the_end_of_each_character_in_consecutive_order_aaccbbaaa_a_c_b_a(Integer int1, Integer int2, Integer int3, Integer int4) {
        //*************MAIN METHOD*************************

        String str = "ssssdddddddsssaa ";

        String strWithNumberCount = "";

        char character = str.charAt(0);

        int repeatedCount = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == character) {

                repeatedCount++;//Keep Adding until chaarcters are not equal

            } else { //Characters are not equal so need to add the line to new string

                strWithNumberCount += character + "" + repeatedCount; //Adding line to new String

                character = str.charAt(i); //Getting a new character

                repeatedCount = 1; //Need to start back at 1

            }

        }

        System.out.println(strWithNumberCount);




    } //DO NOT COPY

    @Given("Find the maximum consecutive repeating character in the String aattaabfff -> f")
    public void find_the_maximum_consecutive_repeating_character_in_the_String_aattaabfff_f() {
        //*************MAIN METHOD*************************

        String str = "aaadddccaaddcmssaaaffffaaaee";

        int maxCount = 0; //Starts at 0 for now but will be change as time goes on

        char maxConsecutiveRepeatedCharacter = str.charAt(0); //Start at first Character in String

        for (int i = 0; i < str.length(); i++) { //Outer Loop

            int currentCount = 1; //Counter for the Character that it is CURRENTLY ON. Always starts at 1 b/c counting itself.

            for (int j = i + 1; j < str.length(); j++) { //Inner Loop

                if (str.charAt(i) != str.charAt(j)) { //If is NOT equal than DO NOT go inside

                    break;

                }

                currentCount++; //ADD to the count & Repeat until it is not equal

            }

            //If condition isOUTSIDE the Inner loop but INSIDE the outer loop

            if (currentCount > maxCount) {

                maxCount = currentCount; //Change to a NEW maxCount

                maxConsecutiveRepeatedCharacter = str.charAt(i); //Change to a NEW Character

            }
        }

        System.out.println("The max Consecutive Letter is " + maxConsecutiveRepeatedCharacter);


        //*************END*************************

    } //DO NOT COPY

    //**********************COLLECTIONS*******************************************

    @Given("Add the count to end of each letter aaabbbccc -> a{int}b{int}c{int} using Maps *ONLY WORKS IF THEY ARE IN ORDER*")
    public void add_the_count_to_end_of_each_letter_aaabbbccc_a_b_c_using_Maps_ONLY_WORKS_IF_THEY_ARE_IN_ORDER(Integer int1, Integer int2, Integer int3) {
        //*************MAIN METHOD*************************

        String str = "aaabbbbbcccc";

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String letter : str.split("")) {
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + entry.getValue());
        }


    } //DO NOT COPY

    @Given("Swap pair numbers in an ArrayList")
    public void swap_pair_numbers_in_an_ArrayList() {
        //*************MAIN METHOD*************************

        //Option 1 : With Collection.swap

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

       //Condition -> Needs to be -2 or else it will be ArrayOutOfBounceException

        for (int i = 0; i < list.size() - 2; i += 2) {

            Collections.swap(list, i, i + 1);

        }

        System.out.println(list);


        //Option 2 : Without


//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//        List<Integer> pairsSwap = new ArrayList<>(numbers); //Need to
//
//        for (int i = 0; i < numbers.size() - 1; i += 2) {
//
//            pairsSwap.set(i, numbers.get(i + 1));
//
//            pairsSwap.set(i + 1, numbers.get(i));
//
//        }
//
//        System.out.println(pairsSwap);


        //*************END*************************

    } //DO NOT COPY

    @Given("Reverse the LETTERS but NOT the SPECIAL CHARACTERS")
    public void reverse_the_LETTERS_but_NOT_the_SPECIAL_CHARACTERS() {
        //*************MAIN METHOD*************************

        String word = "a,b$c";
        String txt = "";

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if (Character.isAlphabetic(word.charAt(i))) {
                list.add(word.indexOf(word.charAt(i)));
            }
        }

        int index = list.size() - 1;

        for (int i = 0; i < word.length(); i++) {

            if (Character.isAlphabetic(word.charAt(i))) {
                txt += word.charAt(list.get(index));
                index--;
            } else {
                txt += word.charAt(i);
            }
        }

        System.out.println(txt);


        //*************END*************************

    } //DO NOT COPY


    @Given("Find the FIRST non repeated Letter or Character in the String using HashMaps")
    public void find_the_FIRST_non_repeated_Letter_or_Character_in_the_String_using_HashMaps() {
        //*************MAIN METHOD*************************

        String str = "We will all make 150 150k 150p 150k";

        char[] strArray = str.replace("\\s", "").toLowerCase().toCharArray();

        Map<Character, Integer> arrayMap = new LinkedHashMap<>();

        for (char c : strArray) {
            if (arrayMap.containsKey(c)) {
                arrayMap.put(c, arrayMap.get(c) + 1);
            } else {
                arrayMap.put(c, 1);
            }
        }

        System.out.println(arrayMap);

        for (Map.Entry entry : arrayMap.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
                break;
            }
        }


        //*************END*************************

    } //DO NOT COPY

    @Given("Find ALL Non Duplicate Pairs in a given Range that SUM to the NUMBER given using collection")
    public void find_ALL_Non_Duplicate_Pairs_in_a_given_Range_that_SUM_to_the_NUMBER_given_using_collection() {
        //*************MAIN METHOD*************************

        //Option 1 : Only LIST and removing one of the pair so it doesn't repeat

        int min = -5;//Starting RANGE
        int max = 5; // Ending RANGE
        int sum = 4; // Sum of number trying ot find

        List<Integer> arr = new ArrayList<Integer>();

        int count = 0;
        for (int i = min; i <= max; i++) {
            arr.add(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                    System.out.println(arr.get(i) + " " + arr.get(j));
                    arr.remove(j); //It removes j so this pair does not match again
                    System.out.println("*********************************");
                }
            }
        }
        System.out.println("Count is " + count);



        //Option 2 with Maps -> Storing it in maps. If both are presents then the pair exists.

//        int min = -5; //Range -> Start
//        int max = 5;// Range -> End
//        int sum = 4;//Find all the pairs that add up to the sum
//
//        List<Integer> arr = new ArrayList<>();
//
//        for (int i = min; i <= max; i++) {
//            arr.add(i);
//        }
//
//        Map<Integer, Integer> map = new HashMap<>(); //Keeping all the pairs
//
//        int count = 0; // Counts each pair
//
//        for (Integer num1 : arr)
//
//            for (Integer num2 : arr)
//                //Searching for pairs
//                if ((num1 + num2 == sum && !(map.containsKey(num1) && map.containsKey(num2)))) {
//
//                    map.put(num1, 1);
//                    map.put(num2, 1);
//
//                    System.out.println(num1 + " " + num2); // Prints Each pair
//                    System.out.println("---------");
//
//                    count++;
//                }
//
//        System.out.println("Count is " + count);



        //********************************END****************************************

    } //DO NOT COPY

    @Given("Is String Balance \\(\\{\\{}})")
    public void is_String_Balance() {
        //*************MAIN METHOD*************************

        String str = "{({})}";

        String[] arr = str.split(""); //Put the string into an array

        int halfSize = arr.length / 2; // Getting the Half of the size of the String arr

        List<String> list1 = new ArrayList<String>(); //First Half of the String arr

        for (int i = 0; i < halfSize; i++) {
            list1.add(arr[i]);
        }

        List<String> list2 = new ArrayList<String>(); //Second Half of the String arr

        for (int i = arr.length - 1; i >= halfSize; i--) {
            list2.add(arr[i]);
        }

        for (String s : list1) { //If this character is in the first half then opposite should be in the second half
            //Remove the opposite in the second half
            // Objective is to get an empty LIST
            if ("{".equals(s)) {
                list2.remove("}");
            } else if ("(".equals(s)) {
                list2.remove(")");
            } else if ("[".equals(s)) {
                list2.remove("]");
            }

        }

//       Option 1: If-Else-Statement

        if (list2.size() == 0) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

//       Option 2: Ternary Operator

//        System.out.println(list2.size() == 0 ? "Balanced" : "Not balanced");


        //********************************END****************************************

    } //DO NOT COPY

    @Given("Count EACH Word in a String with Map")
    public void mcount_EACH_Word_in_a_String_with_Map() {
        //*************MAIN METHOD*************************

        String str = "We will all make 150k 150k 150k 150k";

        Map<String, Integer> map = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {

            if (map.containsKey(word)) {

                map.put(word, map.get(word) + 1);

            } else {

                map.put(word, 1);

            }
        }

        System.out.println(map);

    } //DO NOT COPY

    @Given("Count ALL Letters in a String with Map")
    public void count_ALL_Letters_in_a_String_Duplicate_Characters_in_String_with_Map() {

        //*************MAIN METHOD*************************


        String str = "aabbvvcccca";

        str = str.replace(" ", "").toLowerCase();

        HashMap<Character, Integer> arrayMap = new HashMap<Character, Integer>();

        char[] strArray = str.toCharArray();

        for (char c : strArray) {
            if (arrayMap.containsKey(c)) {
                arrayMap.put(c, arrayMap.get(c) + 1);
            } else {
                arrayMap.put(c, 1);
            }
        }

        for (Map.Entry entry : arrayMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //***************METHOD************************

        //Option 1 w/t MAP COLLECTION

//        public static void duplicateCharacter(String str) {
//
//            HashMap<Character, Integer> arrayMap = new HashMap<Character, Integer>();
//            char[] strArray = str.toCharArray();
//            for (char c : strArray) {
//                if (arrayMap.containsKey(c)) {
//                    arrayMap.put(c, arrayMap.get(c) + 1);
//                } else {
//                    arrayMap.put(c, 1);
//                }
//            }
//            for (Map.Entry entry : arrayMap.entrySet()) {
//                System.out.println(entry.getKey() + " " + entry.getValue());
//            }
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Count Letters in a String & Find The Highest Max Letter Count")
    public void count_Letters_in_a_String_Find_The_Highest_Max_Letter_Count() {

        //*************MAIN METHOD*************************

        String str = "aabbvvcccca";

        str = str.replace(" ", "").toLowerCase();

        HashMap<Character, Integer> arrayMap = new HashMap<Character, Integer>();

        char[] strArray = str.toCharArray(); // Put String into Char[]

        //This is the step to put ALL the letters into Map format

        for (char c : strArray) { //ForEACH Loop
            if (arrayMap.containsKey(c)) {
                arrayMap.put(c, arrayMap.get(c) + 1);
            } else {  //
                arrayMap.put(c, 1);
            }
        }

        //Choose the next option

        //*EntrySet is a Key and Value or ONE pair

        //Optoin 1 : Using Collections.Max

        int maxValueInMap = (Collections.max(arrayMap.values())); // This will retruen max value in the HashMap
        for (Map.Entry<Character, Integer> entry : arrayMap.entrySet()) { //Iterate through HashMap --> Each entrySet (KEY,VALUE)
            if (entry.getValue() == maxValueInMap) { // Value equals the MAX
                System.out.println(entry); // PRINT Max
            }
        }

        //Otpion 2 :

//        char c = ' ';
//        int max = 0;
//        for (Character letter : arrayMap.keySet()) {
//            if(arrayMap.get(letter) > max){
//                max = arrayMap.get(letter);
//                c = letter;
//            }
//        }
//        System.out.println(c + " = " + max);


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Count Letters is a String & Find The Second Highest Max Letter Count")
    public void count_Letters_is_a_String_Find_The_Second_Highest_Max_Letter_Count() {
        //*************MAIN METHOD*************************

        String str = "aabbvvcccca";

        str = str.replace(" ", "").toLowerCase();

        HashMap<Character, Integer> arrayMap = new HashMap<Character, Integer>();

        char[] strArray = str.toCharArray(); // Put String into Char[]

        //This is the step to put ALL the letters into Map format

        for (char c : strArray) { //ForEACH Loop
            if (arrayMap.containsKey(c)) {
                arrayMap.put(c, arrayMap.get(c) + 1);
            } else {  //
                arrayMap.put(c, 1);
            }
        }

        System.out.println(arrayMap);

        //Choose the next option

        //*EntrySet is a Key and Value or ONE pair

        //Optoin 1 : Using Collections.Max

        int maxValue = (Collections.max(arrayMap.values())); // This will return max value in the HashMap
        int secondMaxValue = (Collections.min(arrayMap.values())); // This will return min Value in the HashMap

        for (Map.Entry<Character, Integer> entry : arrayMap.entrySet()) { //Iterate through HashMap --> Each entrySet (KEY,VALUE)
            if (entry.getValue() < maxValue && entry.getValue() > secondMaxValue) { // Less than Max and greater than secondMax
                secondMaxValue = entry.getValue(); // PRINT Max
            }
        }

        System.out.println("The second highest is " + secondMaxValue);


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Count Numbers in a Number & Find the Highest Max Number Count")
    public void count_Numbers_in_a_Number_Find_the_Highest_Max_Number_Count() {
        //*************MAIN METHOD*************************

        String str = "We all are going to make 150k 150k 150k 150k 150k 150k 150k";

        char[] arr = str.replaceAll("\\d|\\s", "").toCharArray();

//        char [] arr = str.replaceAll("\\d","").replaceAll("\\s","").toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);



        //*********END***********************************************


    } //DO NOT COPY

    @Given("Count Numbers in a Number & Find the Second Highest Mas Number Count")
    public void count_Numbers_in_a_Number_Find_the_Second_Highest_Mas_Number_Count() {
        //*************MAIN METHOD*************************

        int num = 132423234;

        char[] arr = String.valueOf(num).toCharArray();//Need to change number into String then change into

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : arr) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int max = Collections.max(map.values());
        int secondMax = Collections.min(map.values());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < max && entry.getValue() > secondMax) {
                secondMax = entry.getValue();
            }
        }

        System.out.println(secondMax);


        //*********END***********************************************


    } //DO NOT COPY

    @Given("Remove Duplicates using Set")
    public void remove_Duplicates_using_Set() {
        //*************MAIN METHOD*************************

        List<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(5);
        num.add(7);
        num.add(8);

        Set<Integer> removeDuplicates = new LinkedHashSet<>(); //Using set b/c it gets rid of ALL duplicates
        removeDuplicates.addAll(num);
        num.clear(); //Need to clear or else you will add on what you already have in the ArrayList
        num.addAll(removeDuplicates);
        System.out.println(num);

        //Option 2

//        Integer [] arr = { 2, 6, 4, 2, 3, 3, 1, 7 };
//        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
//
//        System.out.println(set);


//       Option 3
//        int[] arr = { 2, 6, 4, 2, 2,2,2,2,2,2,2,3, 3, 1, 7 };
//
//        Set<Integer> set = new HashSet<>();
//
//        for (int v : arr) {
//            set.add(v);
//        }
//
//        System.out.println(set);

        //***************METHOD************************

        //Add ARRAYLIST
//        public static List <Integer> removeDuplicates(List<Integer> num) {
//            Set<Integer> removeDuplicates = new LinkedHashSet<>();
//            removeDuplicates.addAll(num);
//            num.clear();
//            num.addAll(removeDuplicates);
//            return num;
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Sort ArrayList without using Collection Sort")
    public void sort_ArrayList_without_using_Collection_Sort() {

        //*************MAIN METHOD*************************

        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(10010);
        arr.add(5);
        arr.add(4);
        arr.add(2);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    int tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                }
            }
        }

        System.out.println(arr);

//      Print out each number
        for (int i : arr) {
            System.out.println(i);
        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Find Duplicate Characters in String with HashMap")
    public void find_Duplicate_Characters_in_String_w_t_HashMap() {
        //*************MAIN METHOD*************************

        String str = "howtodoinjava dot com";

        //Put string into a Char Array
        char[] chars = str.replace(" ", "").toLowerCase().toCharArray();

        Map<Character, Integer> map = new HashMap<>(); //Make a map --> Name it whatever you want

        for (char character : chars) { // For each loop  the char array to find same character
            if (map.containsKey(character)) { //if KEY already exists
                int counter = map.get(character); //Create a counter variable & initial it to the actual value
                map.put(character, ++counter); // Add one on top of the value
                //****IMPORTANT*** You need the ++ BEFORE counter
            } else {
                map.put(character, 1); //If Key doesn't Exist than create a NEW one
            }
        }

        System.out.println(map);

        //Print duplicate characters

        System.out.println("Duplicate characters:");
        for (char character : map.keySet()) { //Looping through the MAP by Keys
            if (map.get(character) > 1) { //Getting the value of character
                System.out.println(character); //If condition is met thean print this
            }
        }


        //*********END***********************************************


        //***************METHOD************************

//        public static void duplicateCharacters(String str){
//
//            char[] chars = str.toCharArray();
//
//            Map<Character, Integer> map = new HashMap<>();
//
//            for (char character : chars) {
//                if (map.containsKey(character)) {
//                    int counter = map.get(character);
//                    map.put(character, ++counter);
//                } else {
//                    map.put(character, 1);
//                }
//            }
//
//            System.out.println("Duplicate characters:");
//
//            //Print duplicate characters
//            for (char character : map.keySet()) {
//                if (map.get(character) > 1) {
//                    System.out.println(character);
//                }
//            }
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Find ALL Duplicate Numbers in Array using HashMap and Print each one")
    public void find_ALL_Duplicate_Numbers_in_Array_using_HashMap_and_Print_each_one() {
        //*************MAIN METHOD*************************

        int[] arr = {2, 3, 2, 3, 3, 3, 3, 2, 2, 4, 4, 4, 4, 4, 5, 5, 5, 5};

        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();

        //Put the Arr into a HashMap
        for (Integer num : arr) {
            if (numMap.containsKey(num)) { //If contains go into loop
                numMap.put(num, numMap.get(num) + 1);//add one
            } else {
                numMap.put(num, 1); //it DOES NOT contain then make a new one
            }
        }

        //Loop through the HashMap
        //*EntrySet = A Pair (KEY, VALUE)
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Sum Of Numbers - Digits using HashMap")
    public void sum_Of_Numbers_Digits_using_HashMap() {
        //*************MAIN METHOD*************************

        int num = 370;

        char[] arr = String.valueOf(num).toCharArray(); //Change num into String first

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int sum = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int key = Character.getNumericValue(entry.getKey()); // Change Character into int to get the actual number
            int value = entry.getValue(); //The occurence it comes up
            sum += key * value;
        }

        System.out.println(sum);


        //*********END***********************************************


    } //DO NOT COPY

    @Given("Armstrong Number using HashMap")
    public void armstrong_Number_using_HashMap() {
        //*************MAIN METHOD*************************

        int num = 370;

        char[] arr = String.valueOf(num).toCharArray(); //Change num into String first

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int sum = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int key = Character.getNumericValue(entry.getKey()); // Change Character into int to get the actual number
            int value = entry.getValue(); //The occurence it comes up
            sum += (key * key * key) * value; //Without Math Class

//            sum += (int) (Math.pow(key,3)) * value; //With Math Class --> You have to downcast b/c Math.power takes Doubles
        }

        System.out.println(num == sum ? "It is an Armstrong Number" : "It is NOT an Armstrong Number");


        //*********END***********************************************


    } //DO NOT COPY

    @Given("Anagram using HashMap with Two ForEach Loop")
    public void anagram_using_HashMap_with_2_ForEach_Loop() {

        //*************MAIN METHOD*************************

        String str1 = "asdf";
        String str2 = "asdf";

        char[] str1Arr = str1.replace(" ", "").toLowerCase().toCharArray();
        char[] str2Arr = str2.replace(" ", "").toLowerCase().toCharArray();

        HashMap<Character, Integer> str1Map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> str2Map = new HashMap<Character, Integer>();


        if (str1.length() == str2.length()) { //If Length are not Equal than it is NOt ANAGRAM

            //First For Each Loop counts the First Letters String and puts it in Map
            for (char c : str1Arr) {
                if (str1Map.containsKey(c)) {
                    str1Map.put(c, str1Map.get(c) + 1);
                } else {
                    str1Map.put(c, 1);
                }
            }

            //Second For Each Loop counts the Second String Letters and puts it is Map
            for (char c : str2Arr) {
                if (str2Map.containsKey(c)) {
                    str2Map.put(c, str2Map.get(c) + 1);
                } else {
                    str2Map.put(c, 1);
                }
            }

            //Option 1: Else-If-Statement

            if (str1Map.equals(str2Map)) {
                System.out.println("Is an Anagram");
            } else {
                System.out.println("Is not an Anagram");
            }

//        //Option 2: Ternary Operator

//        System.out.println(str1Map.equals(str2Map) ? "Is Anagram" : "Is not Anagram");

        } else {
            System.out.println("Is not Anagram");
        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Anagram using HashMap with One ForLoop")
    public void anagram_using_HashMap_with_One_ForLoop() {

        //*************MAIN METHOD*************************

        String str1 = "asdf";
        String str2 = "asdf";

        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        HashMap<Character, Integer> str1Map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> str2Map = new HashMap<Character, Integer>();

        if (str1.length() == str2.length()) { //If length don't match **NOT ANAGRAM

            for (int i = 0; i < str1.length(); i++) { //LENGTHS are the same ->Choose one
                //First HashMap
                if (str1Map.containsKey(str1.charAt(i))) {//If Key EXISTs enter into the body
                    int value = str1Map.get(str1.charAt(i));//Getting the value
                    str1Map.put(str1.charAt(i), ++value); //Adding one to the value -> Make sure you put ++ INFRONT
                } else {
                    str1Map.put(str1.charAt(i), 1);//if Key DOES NOT EXIST then make a new one
                }
                //Second HashMap
                if (str2Map.containsKey(str2.charAt(i))) {//If key EXISTs enter into the body
                    int value = str2Map.get(str2.charAt(i));//Getting te value
                    str2Map.put(str2.charAt(i), ++value);//Adding on to the value => Make sure you put ++ INFRONT
                } else {
                    str2Map.put(str2.charAt(i), 1); //If Key DOES NOT EXIST then make a new one
                }
            }

            //Option 1: Else-If-Statement

            if (str1Map.equals(str2Map)) {
                System.out.println("Is an Anagram");
            } else {
                System.out.println("Is not an Anagram");
            }

//        //Option 2: Ternary Operator

//        System.out.println(str1Map.equals(str2Map) ? "Is Anagram" : "Is not Anagram");

        } else {
            System.out.println("Is not an Anagram");
        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Find ALL Anagram in the String Array with Lists")
    public void find_ALL_Anagram_in_the_String_Array_with_Lists()  {
        //*************MAIN METHOD*************************

        //***** NEED TO COPY THE BELOW METHOD AS WELL

        String[] arr = {"mom", "mom1", "mom2", "omm", "mmo"};

        List<String> list = new ArrayList<String>(); //Will keep the Anagrams

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (isAnagram(arr[j], arr[i])) { //If True
                    if (!(list.contains(arr[i]))) {//Check if arr[i] String is not in the list
                        list.add(arr[i]);//If not than add
                    } else if (!(list.contains(arr[j]))) { //Check if arr[j] String is not in the list
                        list.add(arr[j]);// if not than add
                    }
                }
            }
        }

        System.out.println(list);//Print out ALL the Anagrams

    }

        //***** COPY ME COPY ME isAnagram()

    public static boolean isAnagram(String word1, String word2) {

        boolean anagram = false;

        String word_1 = word1.replace("\\s", "").toLowerCase();
        String word_2 = word2.replace("\\s", "").toLowerCase();

        char[] str1 = word_1.toCharArray();
        char[] str2 = word_2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if (Arrays.equals(str1, str2)) {
            anagram = true;
        }

        return anagram;

    }

    //************************* END NEED TO COPY METHOD AS WELL ******************************************************

    @Given("Find ALL Anagram in the String Array with Maps")
    public void find_ALL_Anagram_in_the_String_Array_with_Maps() {
        //*************MAIN METHOD*************************


        String[] arr = {"150k", "145k", "105k", "135k","154k"};


        Map<Character, Integer> map1 = new HashMap<>(); //First map contains arr[i] String

        Map<Character, Integer> map2 = new HashMap<>();//Second map contains arr[j] String

        List<String> list = new ArrayList<>(); //Keep all the Anagrams


        for (int i = 0; i < arr.length; i++) { // OUTER For Loop

            char[] arr1 = arr[i].toCharArray(); // Make an arr with chars

            for (char c : arr1) { //For Each Loop

                if (map1.containsKey(c)) { // If contains the KEY than ADD the VALUE

                    map1.put(c, map1.get(c) + 1);

                } else { // If it does NOT contain the KEY than CREATE a NEW ONE

                    map1.put(c, 1);

                }
            }


            for (int j = i + 1; j < arr.length; j++) { // INNER For Loop

                char[] arr2 = arr[j].toCharArray(); // Make an arr with chars

                for (char c : arr2) {

                    if (map2.containsKey(c)) { // If contains the KEY than ADD the VALUE

                        map2.put(c, map2.get(c) + 1); // If contains the KEY than ADD the VALUE

                    } else { // If it does NOT contain the KEY than CREATE a NEW ONE

                        map2.put(c, 1);
                    }
                }

//               UnComment to see what is happening
//                System.out.println("_________________" + map1);
//                System.out.println(map2);

                if (map1.equals(map2)) { //Checking if ALL the KEYS and VALUES are the SAME

                    if (!(list.contains(arr[i]))) { //If arr[i] String does NOT Contain in the LIST THAN ADD

                        list.add(arr[i]); // Add

                    } else if (!(list.contains(arr[j]))) { //If arr[j] String does NOT CONTAIN in the LIST THAN ADD

                        list.add(arr[j]); //Add

                    }
                }

                map2.clear(); //***Important** NEED TO CLEAR in the Second For Loop or Else it will keep on adding
            }

            map1.clear(); //NEED TO CLEAR in the FIRST For Loop or ELSE it will keep on adding

            //**Reccomendation** Comment map2.Clear() && map1.Clear()
            //                   UnComment the SOUt on line 65 & 66 to see what is happening

        }


        System.out.println(list);

        //*********END**************************************


    } //DO NOT COPY


    //    *****************************REGEX****************************************

    @Given("Given Sum of Numbers - Digits in a String with Letters using Regex")
    public void given_Sum_of_Numbers_Digits_in_a_String_with_Letters_using_Regex() {
        //*************MAIN METHOD*************************

        String str1 = "We all are going to make 150k 150k 150k 150k";

        //  \\D -> ALL NON DIGIT NUMBERS
            String str2 = str1.replaceAll("\\D", "");

        //Put the string into an array
        String [] arr = str2.split("");

        int sum = 0;

        for (String s : arr) {

            sum += Integer.parseInt(s);

        }

        System.out.println("The sum of number is " + sum);


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Count ALL Letters NOT Numbers - Digits in a String with Map and Regex")
    public void count_ALL_Letters_NOT_Numbers_Digits_in_a_String_with_Map_and_Regex() {
        //*************MAIN METHOD*************************

        String str = "We all are going to make 150k 150k 150k 150k 150k 150k 150k";

        // \\d -> Takes Away ALL Digits
        // \\s -> Takes Away ALL Spaces

        String str2 = str.replaceAll("\\d|\\s", ""); //Output -> Weallaregoingtomakekkkkk

        //String str2 = str.replaceAll("[0-9]|\\s",""); //Other Option

        System.out.println(str2);

        char[] arr = str2.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Remove Numbers-Digits in sentence")
    public void remove_Numbers_Digits_in_sentence() {
        //*************MAIN METHOD*************************

        String sentence = "Hello1 Word2 War3";

                                                // [0-9] is the same as \\d

        String removeDigits = sentence.replaceAll("[0-9]", "");

        System.out.println(removeDigits);


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Find Count of Word or Substring")
    public void find_Count_of_Word_or_Substring() {
        //*************MAIN METHOD*************************

        //Option 1

        String str = "We are going to make 150k 150k 150k 150k";

        String[] arr = str.split("\\s"); // \\s == White Spaces

        int count = 0;

        for (String word : arr) {
            if (word.matches("150k")) {
                count++;
            }
        }

        System.out.println(count);

        //Option 2

//        String str = "Java is Examples Java is Code Java is Program.";
//
//        int count = (str.split("Java", -1).length) - 1;
//
//        System.out.println("Total occurrences: " + count);


        //*********END***********************************************

    } //DO NOT COPY


    @Given("Reverse the LETTERS but NOT the SPECIAL CHARACTERS using Regex")
    public void reverse_the_LETTERS_but_NOT_the_SPECIAL_CHARACTERS_using_Regex() {
        //*************MAIN METHOD*************************

       //Option 1 : Using [^a-zA-Z] == Everything Except LETTERS

        String str = "a,c!t;q";

        String [] arr = str.split("");

        StringBuilder sb = new StringBuilder(str.replaceAll("[^a-zA-Z]", "\\s"));

        sb.reverse();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].matches("[^a-zA-Z]")){
                System.out.print(arr[i]);
            } else {
                System.out.print(sb.charAt(i));
            }
        }

        //Option 2 : Using \\W == Every non-word Character

//        String str = "a,c!t;q";
//
//        String [] arr = str.split("");
//
//        StringBuilder sb = new StringBuilder(str.replaceAll("\\W", "\\s"));
//
//        sb.reverse();
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i].matches("\\W")){
//                System.out.print(arr[i]);
//            } else {
//                System.out.print(sb.charAt(i));
//            }
//        }



        //*********END***********************************************

    } //DO NOT COPY

    //********************************************String Builder Or String Buffer************************************

    @Given("Reverse String using StringBuilder")
    public void reverse_String_using_StringBuilder() {
        //*************MAIN METHOD*************************

        String str = "Hello World";
        // Create a instance of the Class
        StringBuilder sb = new StringBuilder(str);
        //Use the method
        System.out.println(sb.reverse());

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Reverse Each Word in the Sentence using StringBuilder")
    public void reverse_Each_Word_in_the_Sentence_using_StringBuilder() {
        //*************MAIN METHOD*************************

        String str = "We are going to make 150k 150k 150k";

        StringBuilder s = new StringBuilder(str);

        str = s.reverse().toString(); //Reverses the SENTENCE and WORD

        String[] rev = str.split("\\s");

        StringBuilder reverse = new StringBuilder();

        for (int i = rev.length - 1; i >= 0; i--) { //Need to Reverse the SENTENCE

            reverse.append(rev[i]).append(" ");
        }

        System.out.println(reverse);

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Anagram with StringBuilder")
    public void anagram_with_StringBuilder() {
        //*************MAIN METHOD************************

        String str1 = "mom";

        String str2 = " omm";

        StringBuilder sb2 = new StringBuilder(str2);

        for (int i = 0; i < str1.length(); i++) { //First String -> Regular For Loop
            for (int j = 0; j < sb2.length(); j++) { // StringBuilder String -> Regular For Loop
                if (str1.charAt(i) == sb2.charAt(j)) {
                    sb2.deleteCharAt(j); //Delete from the StringBuilder String
                    break; //Need to break because we want this to happen ONLY once
                }
            }
        }

        //IF-ELSE-STATEMENT is another way to print out.
        System.out.println(sb2.length() == 0 ? "Anagram" : "Not an Anagram");

        //*********END**************************************

    } //DO NOT COPY



    //********************************************SHAPES************************************

    @Given("Write K with Asterisks *")
    public void write_K_with() {
        //*************MAIN METHOD*************************

        int i, j;
        int rows = 6;
        for (i = rows; i >= 1; i--) {
            System.out.print("*");
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (i = 2; i <= rows; i++) {
            System.out.print("*");
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Diamond of Asterisks *")
    public void diamond_of_Asterisks() {

        //*************MAIN METHOD*************************

        // Declaring and initializing variables

        // Variable initialized to the row where max star
        // should be there as after that they decreases to
        // give diamond pattern
        int number = 7;

        int m, n;

        // Outer loop 1
        // prints the first half diamond
        for (m = 1; m <= number; m++) {

            // Inner loop 1 print whitespaces inbetween
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            // Inner loop 2 prints star
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }

        // Outer loop 2
        // Prints the second half diamond
        for (m = number - 1; m > 0; m--) {

            // Inner loop 1 print whitespaces inbetween
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            // Inner loop 2 print star
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            // Ending line after each row
            System.out.println();
        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Pyramid of Numbers")
    public void pyramid_of_Numbers() {
        //*************MAIN*************************

        //How many rows (int rows) you want in your pyramid
        int rows = 5;
        int rowCount = 1; //Don't Change

        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();
            rowCount++;
        }

        //***************METHOD************************

        //How many rows (int rows) you want in your pyramid
//       public static void numberPyramid(int rows) {
//            int rowCount = 1; //Don't Change
//
//            for (int i = rows; i > 0; i--) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("");
//                }
//                for (int j = 1; j <= rowCount; j++) {
//                    System.out.print(rowCount + " ");
//                }
//                System.out.println();
//                rowCount++;
//            }
//        }


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Floyds Triangle")
    public void floyds_Triangle() {
        //*************MAIN*************************
        /*
        Floyd’s triangle is a triangle with first natural numbers.
        It is the right arrangement of the numbers/values or patterns.
        Basically, it is a left to right arrangement of natural numbers
        in a right-angled triangle

        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
         */

        // No of rows to be printed
        int n = 5;

        // Creating and initializing variable for
        // rows, columns and display value
        int i, j, k = 1;

        // Nested iterating for 2D matrix
        // Outer loop for rows
        for (i = 1; i <= n; i++) {

            // Inner loop for columns
            for (j = 1; j <= i; j++) {

                // Printing value to be displayed
                System.out.print(k + "  ");

                // Incremeting value displayed
                k++;
            }

            // Print elements of next row
            System.out.println();
        }



        //*********END***********************************************

    } //DO NOT COPY


    //****************************************Basic Lambda Expressions*********************************

    @Given("Even - Odd using Lambda Expression")
    public void even_Odd_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Predicate<Integer> p = i  -> i % 2 == 0;
        System.out.println(p.test(10) ? "Even" : "Odd");


        //**********************************End********************************************
    } //DO NOT COPY

    @Given("Reverse String using StringBuilder and Lambda Expression")
    public void reverse_String_using_StringBuilder_and_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Function<String, String> f = str -> {
            StringBuilder sb = new StringBuilder(str); //Do NOT forget the Parameter in Constructor
            return String.valueOf(sb.reverse()); //Need to change to string -> String.ValueOf
        };

        System.out.println(f.apply("hello"));


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Reverse Number using Lambda Expression")
    public void reverse_Number_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Function<Integer, Integer> f = num -> {
            int reversed = 0;
            while (num != 0) {// If number is not 0 (zero) go inside the loop --> 123 is not 0
                int remainder = num % 10;// value is the remainder of the number --> 123 / 10 = 3 (is the remainder)
                reversed = reversed * 10 + remainder;  // reverse NEW value is this calculation --> (0 * 10) + 3 = 3
                num /= 10; // num NEW value --> 123 / 10 = 12   *It is an integer so NO decimals
                // REPEAT until num value is 0 (zero)
            }
            return reversed;
        };

        System.out.println(f.apply(1234));


        //**********************************End********************************************


    } //DO NOT COPY

    @Given("String Palindrome using StringBuilder and Lambda Expression")
    public void string_Palindrome_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Function<String, String> f = str -> {
            StringBuilder sb = new StringBuilder(str); //Do NOT forget the Parameter in Constructor
            return String.valueOf(sb.reverse()); //Need to change to string -> String.ValueOf
        };

        System.out.println(f.apply("mom").equalsIgnoreCase("mom") ? "Is Palindrome" : "Not a Palindrome");


        //**********************************End********************************************


    } //DO NOT COPY

    @Given("Number Palindrome using Lambda Expression")
    public void number_Palindrome_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Predicate<Integer> p = num -> {
            int palindrome = num; // First, Need to put num into new variable b/c it is going to change values in the while loop
            int reversed = 0; // Second, We need to reverse the number
            while (num != 0) {// If number is not 0 (zero) go inside the loop --> 123 is not 0
                int remainder = num % 10;// value is the remainder of the number --> 123 / 10 = 3 (is the remainder)
                reversed = reversed * 10 + remainder;  // reverse NEW value is this calculation --> (0 * 10) + 3 = 3
                num /= 10; // num NEW value --> 123 / 10 = 12   *It is an integer so NO decimals
                // REPEAT until num value is 0 (zero)
            }
            return palindrome == reversed;
        };

        System.out.println(p.test(112) ? "Number is Palindrome" : "Number is NOT a Palindrome");

        //**********************************End********************************************


    } //DO NOT COPY

    @Given("Prime Number using Lambda Expression")
    public void prime_Number_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Predicate<Integer> p = num -> {

            boolean isPrime = true; //Trying to prove it NOT a Prime Number
            for (int i = 2; i < num; ++i) { //Start with 2 b/c ALL numbers can be divided by 1(one)
                //Using Less than b/c we are using ALL numbers EXCEPT itself
                if (num % i == 0) {//ANY numbers in between 1 and itself are divisible then it is false
                    isPrime = false;
                    break; //No need to keep checking, That is why we break
                }
            }
            return isPrime;
        };

        System.out.println(p.test(5) ? "Prime Number" : "Not a Prime Number");


        //**********************************End********************************************


    } //DO NOT COPY

    @Given("Factorial using Lambda Expression")
    public void factorial_using_Lambda_Expression() {
        //*************MAIN*************************

        //What is factorial ?
        //The product (multiplication) of ALL Positive integers
        //Ex. 5! --> 1*2*3*4*5

        Function<Integer, Integer> f = num -> {
            int factorialSum = 1;
            for (int i = 2; i <= num; i++) { //No need to start w/t ONE --> One times a number is itself (DOES NOT change)
                factorialSum *= i;
            }
            return factorialSum;
        };

        System.out.println(f.apply(5));


        //**********************************End********************************************


    } //DO NOT COPY

    @Given("Fibonacci using Lambda Expression")
    public void fibonacci_using_Lambda_Expression() {
        //*************MAIN*************************

        Consumer<Integer> c = max -> {

            int num1 = 0; // first number is 0

            int num2 = 1; // 2nd number is 1

            for (int i = 0; i < max; i++) {

                System.out.print(num1 + " "); //Print num1

                int sum = num1 + num2; // sum will give us next number in the line

                num1 = num2; // Change the value for num1 to num2

                num2 = sum; // Change the value for num2 to sum

                //Repeat itself until max range number

            }
        };

        c.accept(5); //This will print 5 numbers


        //**********************************End********************************************


    } //DO NOT COPY

    @Given("FizzBuzz using Lambda Expression")
    public void fizzbuzz_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Predicate<Integer> p1 = i -> i % 15 == 0; //5 * 3 = 15
        Predicate<Integer> p2 = i -> i % 3 == 0;
        Predicate<Integer> p3 = i -> i % 5 == 0;

        Consumer<Integer> c = num -> {
            for (int i = 0; i <= num; i++) {
                if (p1.test(i)) {
                    System.out.println("FizzBuzz");
                } else if (p2.test(i)) {
                    System.out.println("Fizz");
                } else if (p3.test(i)) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        };

        c.accept(50);

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Only Unique - Distinct Letters using Lambda Expression")
    public void only_Unique_Distinct_Letters_using_Lambda_Expression() {
        //*************MAIN*************************

        Function<String, String> f = str -> {
            str = str.replace(" ", "").toLowerCase();
            String unique = "";
            for (int i = 0; i < str.length(); i++) {
                if (!unique.contains("" + str.charAt(i))) {//unique DOES NOT contain any letters in the String than ADD it
                    unique += str.charAt(i);
                }
            }
            return unique;
        };

        System.out.println(f.apply("aaaaaaadddddddddbbbbbbbbbbcccccccccc"));


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Are there Duplicate Numbers in the Array using Lambda Expression")
    public void are_there_Duplicate_Numbers_in_the_Array_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Predicate<int[]> p = arr -> {
            boolean hasDuplicates = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        hasDuplicates = true;
                        break;
                    }

                }
            }
            return hasDuplicates;
        };

        System.out.println(p.test(new int[]{2, 3, 4, 5}));

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Find Duplicate Numbers and Print Each One using Lambda Expression")
    public void find_Duplicate_Numbers_and_Print_Each_One_using_Lambda_Expression() {
        //*************MAIN*************************

        Consumer<int[]> c = arr -> {

            int count = 0; //Counter variable
            for (int j = 0; j < arr.length; j++) { // j's value (index 0) = 1 (Changes value after inner loop is complete)
                for (int k = j + 1; k < arr.length; k++) {  // k's value is always one ahead b/c you don't want to check itself
                    // k value (index 1) = 2; (Start at index 1 and move forward)
                    if (arr[j] == arr[k]) { //If any values are equal to each othe
                        count++; //Add one to the counter variable
                    }
                }
                if (count == 1)//Equals to one b/c you want to print the duplicates once
                    System.out.println(arr[j]);
                count = 0; //Reset the value
            }
        };

        c.accept(new int[]{12, 3, 2, 1, 3, 4, 12, 3, 4, 5});


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Largest Number in Array using Lambda Expression")
    public void largest_Number_in_Array_using_Lambda_Expression() {
        //**************************MAIN*************************

        Consumer<int[]> c = arr -> {
            //USE SORT FUNCTION FIRST
            int largestNum = arr[0]; //Start with the first value of the array (Zero index)
            for (int i = 1; i < arr.length; i++) { //Start with the second value of array (first index) b/c first value is CURRENT largestNum
                if (arr[i] > largestNum) { //If the value of array is larger THAN enter
                    largestNum = arr[i];//Change current value into new value
                }
            }
            System.out.println(largestNum);
        };

        c.accept(new int[]{2, 3, 5, 1, 3, 5});


        //***************************END***********************************************

    } //DO NOT COPY

    @Given("Smallest Number in Array using Lambda Expression")
    public void smallest_Number_in_Array_using_Lambda_Expression() {
        //***************************MAIN*************************

        Consumer<int[]> c = arr -> {
            //USE SORT FUNCTION FIRST
            int smallestNumber = arr[0]; //Start with the first value of the array(Zero Index)
            for (int i = 1; i < arr.length; i++) { //Start with the second value of array(first index) b/c first value is CURRENT smallestNumber
                if (arr[i] < smallestNumber) { //If the value of array is smaller THAN enter
                    smallestNumber = arr[i]; //Change current value into new value
                }
            }
            System.out.println(smallestNumber);
        };

        c.accept(new int[]{2, 3, 5, 2, 1, 34, 2, 3, -1});


        //***************************END***********************************************

    } //DO NOT COPY

    //****************************************Lambda Expressions with Collections*********************************

    @Given("Given Is String Balance \\(\\{\\{}}) using Lambda Expression")
    public void given_Is_String_Balance_using_Lambda_Expression() {
        //*************MAIN METHOD*************************
        Consumer<String> c = str -> {

            char[] arr = str.toCharArray();

            int halfSize = arr.length / 2;

            List<String> list1 = new ArrayList<String>();

            for (int i = 0; i < halfSize; i++) {
                list1.add(String.valueOf(arr[i]));
            }

            List<String> list2 = new ArrayList<String>();
            for (int i = arr.length - 1; i >= halfSize; i--) {
                list2.add(String.valueOf(arr[i]));
            }

            for (String s : list1) {
                switch (s) {
                    case "{" -> list2.remove("}");
                    case "(" -> list2.remove(")");
                    case "[" -> list2.remove("]");
                }
            }

            System.out.println(list2.size() == 0 ? "Balanced" : "Not balanced");
        };

        c.accept("({({})})");


        //********************************END****************************************

    } //DO NOT COPY

    @Given("Count ALL Letters in a String with Map using Lambda Expression")
    public void count_ALL_Letters_in_a_String_with_Map_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Function<String, HashMap<Character, Integer>> f = str -> { //Converts into HasHmap and counts

            str = str.replace(" ", "").toLowerCase();

            char[] strArray = str.toCharArray();

            HashMap<Character, Integer> arrayMap = new HashMap<Character, Integer>();

            for (char c : strArray) {
                if (arrayMap.containsKey(c)) {
                    arrayMap.put(c, arrayMap.get(c) + 1);
                } else {
                    arrayMap.put(c, 1);
                }
            }
            return arrayMap;
        };

        Consumer<HashMap<Character, Integer>> c = m -> {
            for (Map.Entry entry : m.entrySet()) {
                System.out.println(entry); // Prints likes this -> Key=Value
//            System.out.println(entry.getKey() + " " + entry.getValue()); //Prints like this -> Key Value
            }
        };

        c.accept(f.apply("asdfadsfasdf"));

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Count EACH WORD in a String with Map using Lambda Expression")
    public void count_EACH_WORD_in_a_String_with_Map_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Consumer<String> c = str -> {

            Map<String, Integer> map = new HashMap<>();

            String[] words = str.split(" ");

            for (String word : words) {

                if (map.containsKey(word)) {

                    map.put(word, map.get(word) + 1);

                } else {
                    map.put(word, 1);
                }
            }

            System.out.println(map);

        };

        c.accept("hello hello world world you are amazing!! 150k 150k 150k 150k");

    } //DO NOT COPY
    @Given("Anagram using Lambda Expression")
    public void anagram_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Function<String, HashMap<Character, Integer>> f = str -> {

            char[] arr = str.replace("\\s", "").toLowerCase().toCharArray();

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            for (char c : arr) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            return map;
        };

        System.out.println(f.apply("adsf").equals(f.apply("asdf")) ? "Is an Anagram" : "Is NOT an Anagram");


        //*********END***********************************************

    } //DO NOT COPY


    @Given("Find ALL Anagram in the String Array using Lambda Expression")
    public void find_ALL_Anagram_in_the_String_Array_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Function<String, HashMap<Character, Integer>> f = str -> {

            char[] arr = str.replace("\\s", "").toLowerCase().toCharArray();

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            for (char c : arr) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            return map;
        };

        String[] arr = {"150k", "145k", "105k", "135k", "154k"};

        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (f.apply(arr[i]).equals(f.apply(arr[j]))) {
                    if (!(list.contains(arr[i]))) list.add(arr[i]);
                    else if (!(list.contains(arr[j]))) list.add(arr[j]);
                }
            }
        }

        System.out.println(list);

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Count Letters in a String & Find The Highest Max Letter Count using Lambda Expression")
    public void count_Letters_in_a_String_Find_The_Highest_Max_Letter_Count_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Function<String, HashMap<Character, Integer>> f = str -> { //Converts String into Map w/t Letters counted

            char[] arr = str.replace(" ", "").toLowerCase().toCharArray();

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            for (char c : arr) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            return map;
        };

        Consumer<HashMap<Character, Integer>> c = m -> {
            int maxValueInMap = (Collections.max(m.values())); // This will retruen max value in the HashMap
            for (Map.Entry<Character, Integer> entry : m.entrySet()) { //Iterate through HashMap --> Each entrySet (KEY,VALUE)
                if (entry.getValue() == maxValueInMap) { // Value equals the MAX
                    System.out.println(entry); // PRINT Max
                }
            }
        };

        c.accept(f.apply("adsfsdfsadfasdfsdaddddddd"));

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Count Letters is a String & Find The Second Highest Max Letter Count using Lambda Expression")
    public void count_Letters_is_a_String_Find_The_Second_Highest_Max_Letter_Count_using_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Function<String, HashMap<Character, Integer>> f = str -> {

            char[] arr = str.replace(" ", "").toLowerCase().toCharArray();

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            for (char c : arr) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            return map;
        };


        Consumer<HashMap<Character, Integer>> c = m -> {
            int maxValue = (Collections.max(m.values())); // This will return max value in the HashMap
            int secondMaxValue = (Collections.min(m.values())); // This will return min Value in the HashMap
            char key = ' ';

            for (Map.Entry<Character, Integer> entry : m.entrySet()) { //Iterate through HashMap --> Each entrySet (KEY,VALUE)
                if (entry.getValue() < maxValue && entry.getValue() > secondMaxValue) { // Less than Max and greater than secondMax
                    secondMaxValue = entry.getValue(); // PRINT Max
                    key = entry.getKey();
                }
            }
            System.out.println(key + " " + secondMaxValue);
        };

        c.accept(f.apply("asdfasdfsdddddssasdf"));

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Remove Duplicates using Set Lambda Expression")
    public void remove_Duplicates_using_Set_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Function<ArrayList<Integer>, ArrayList<Integer>> f = a -> {
            //Using set b/c it gets rid of ALL duplicates
            Set<Integer> s = new LinkedHashSet<>(a);//USE Link -> keep the order //USE Tree -> ascending order
            a.clear(); //Need to clear or else you will add on what you already have in the ArrayList
            a.addAll(s);
            return a;
        };

        System.out.println(f.apply(new ArrayList<>(Arrays.asList(2, 5, 2, 1, 3, 5, 3))));


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Sort ArrayList without using Collection Sort Lambda Expression")
    public void sort_ArrayList_without_using_Collection_Sort_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Function<ArrayList<Integer>, ArrayList<Integer>> f = arr -> {

            for (int i = 0; i < arr.size(); i++) {
                for (int j = arr.size() - 1; j > i; j--) {
                    if (arr.get(i) > arr.get(j)) {
                        int tmp = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, tmp);
                    }
                }
            }
            return arr;
        };

        System.out.println(f.apply(new ArrayList<>(Arrays.asList(1, 3, 5, 2, 3, 6, 6, 4, 4, 32, 3, -1))));

//       // Prints Each one out
//        Consumer<ArrayList<Integer>> c = arr -> {
//            for (int i : arr) {
//                System.out.println(i);
//            }
//        };
//
//
//        c.accept(f.apply(new ArrayList<>(Arrays.asList(2,4,6,3,4,6,2,4,2,1,1,3))));

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Find Duplicate Characters in String with HashMap Lambda Expression")
    public void find_Duplicate_Characters_in_String_with_HashMap_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Function<String, HashMap<Character, Integer>> f = str -> {

            char[] arr = str.replace(" ", "").toLowerCase().toCharArray();

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            for (char c : arr) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            return map;
        };

        Consumer<HashMap<Character, Integer>> c = map -> {
            for (char character : map.keySet()) { //Looping through the MAP by Keys
                if (map.get(character) > 1) { //Getting the value of character
                    System.out.println(character); //If condition is met then print this
                }
            }
        };


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Find ALL Duplicate Numbers in Array using HashMap and Print each one Lambda Expression")
    public void find_ALL_Duplicate_Numbers_in_Array_using_HashMap_and_Print_each_one_Lambda_Expression() {
        //*************MAIN METHOD*************************

        Function<String, HashMap<Character, Integer>> f = str -> {

            char[] arr = str.replace(" ", "").toLowerCase().toCharArray();

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            for (char c : arr) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            return map;
        };

        Consumer<HashMap<Character, Integer>> c = map -> {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey());
                }
            }
        };

        c.accept(f.apply("adsfadsfasdfffddssaaaa"));


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Sum Of Numbers - Digits using Lambda Expression")
    public void sum_Of_Numbers_Digits_using_Lambda_Expression() {
        //*************MAIN*************************

        Function<Integer,HashMap<Character,Integer>> f = num-> {
            char[] arr = String.valueOf(num).toCharArray(); //Change num into String first

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            for (char c : arr) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            return map;
        };

        Consumer<HashMap<Character,Integer>> c = map-> {
            int sum = 0;

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                int key = Character.getNumericValue(entry.getKey()); // Change Character into int to get the actual number
                int value = entry.getValue(); //The occurence it comes up
                sum += key * value;
            }
            System.out.println(sum);
        };

        c.accept(f.apply(2234)); // sum = 11


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Armstrong Number using Lambda Expression")
    public void armstrong_Number_using_Lambda_Expression() {
        //*************MAIN*************************

        // This program computes all Armstrong numbers in the range of 0 and 999.
        // An Armstrong number is a number such that the sum
        // of its digits raised to the third power is equal to the number itself.
        // For example, 371 is an Armstrong number, since
        // 3*3*3 + 7*7*7 + 1*1*1 = 371.
        //  27   +  343  + 1     = 371

        Function<Integer, HashMap<Character, Integer>> f1 = num -> {

            char[] arr = String.valueOf(num).toCharArray(); //Change num into String first

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            for (char c : arr) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            return map;
        };

        Function<HashMap<Character, Integer>, Integer> f2 = map -> {

            int sum = 0;

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                int key = Character.getNumericValue(entry.getKey()); // Change Character into int to get the actual number
                int value = entry.getValue(); //The occurence it comes up
                sum += (key * key * key) * value; //Without Math Class

//            sum += (int) (Math.pow(key,3)) * value; //With Math Class --> You have to downcast b/c Math.power takes Doubles
            }

            return sum;
        };

        int num = 370;
        System.out.println(f2.apply(f1.apply(num)) == num ? "It is an Armstrong Number" : "It is NOT an Armstrong Number");

        int num2 = 123;
        System.out.println(f2.apply(f1.apply(num2)) == num2 ? "It is an Armstrong Number" : "It is NOT an Armstrong Number");


        //*********END***********************************************

    } //DO NOT COPY

//    ********************************Streams*******************************************************************************

    @Given("Smallest Number in Array using Streams")
    public void smallest_Number_in_Array_using_Stream() {
        //*************MAIN METHOD*************************

        Function<int[], Integer> f = arr -> {

            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

            Optional<Integer> result = list.stream().min(Integer::compareTo); //min((x,y)-> x.compareTo(y))

            return result.get();
        };

        System.out.println(f.apply(new int[]{22, 3, 5, 33, 2, 344}));


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Largest Number in Array using Streams")
    public void largest_Number_in_Array_using_Streams() {
        //*************MAIN METHOD*************************

        Function<int[], Integer> f = arr -> {

            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

            Optional<Integer> result = list.stream().max(Integer::compareTo); //max((x,y)-> x.compareTo(y))

            return result.get();
        };

        System.out.println(f.apply(new int[]{22, 3, 5, 33, 2, 344}));


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Smallest Number in ArrayList using Streams")
    public void smallest_Number_in_ArrayList_using_Streams() {
        //*************MAIN METHOD*************************

        Function<List<Integer>, Integer> f = arr-> {

            List<Integer> list = new ArrayList<>(arr);

            Optional<Integer> result = list.stream().min(Integer::compareTo); //min((x,y)-> x.compareTo(y))

            return result.get();

        };

        System.out.println(f.apply(new ArrayList<Integer>(Arrays.asList(2,3,52,1,3))));


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Largest Number in ArrayList using Streams")
    public void largest_Number_in_ArrayList_using_Streams() {
        //*************MAIN METHOD*************************

        Function<List<Integer>, Integer> f = arr-> {

            List<Integer> list = new ArrayList<>(arr);

            Optional<Integer> result = list.stream().max(Integer::compareTo); //max((x,y)-> x.compareTo(y))

            return result.get();

        };

        System.out.println(f.apply(new ArrayList<Integer>(Arrays.asList(2,3,52,1,3))));



        //*********END***********************************************

    } //DO NOT COPY

    @Given("Sort Ascending and Descending Order in Array using Streams")
    public void sort_Array_using_Streams() {
        //*************MAIN METHOD*************************

        Function<int[], Integer[]> f = arr -> {

            //Ascending Order
            return Arrays.stream(arr).boxed().sorted().toArray(Integer[]::new);

            //Descending Order
//            return Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);

        };

        System.out.println(Arrays.toString(f.apply(new int[]{2, 52, 3, 5, 2, 3, 4, 6, 8, 8, 4, 5})));


        //*********END***********************************************

    } //DO NOT COPY

    @Given("Sort Ascending and Descending Order in ArrayList using Streams")
    public void sort_ArrayList_using_Streams() {
        //*************MAIN METHOD*************************

        Function<List<Integer>, List<Integer>> f = arr -> {

            //Ascending Order
            return arr.stream().sorted().collect(Collectors.toList());

            //Descending Order
//            return arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        };

        System.out.println(f.apply(new ArrayList<>(Arrays.asList(2, 3, 5, 2, 1, 234))));

        //*********END***********************************************

    } //DO NOT COPY

    @Given("Only Unique - Distinct Letters using Sreams")
    public void only_Unique_Distinct_Letters_using_Sreams() {
        //*************MAIN METHOD*************************

        Function<String, String> f = str -> {

            List<Character> list = new ArrayList<Character>();

            for (int i = 0; i < str.length(); i++) {
                list.add(str.charAt(i));
            }

            List<Character> distinctLetters = list.stream().distinct().collect(Collectors.toList());

            String unique = "";

            for (char c : distinctLetters) {
                unique += c;
            }

            return unique;
        };

        System.out.println(f.apply("aaaaaaaaaaaadddddddddddddccccccccccc"));


        //*********END***********************************************

    } //DO NOT COPY


}
