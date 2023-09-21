package org.example;

public class Solutions {

//    1. Bob needs a fast way to calculate the volume of a cuboid with three values:
//    the length, width and height of the cuboid. Write a function to help Bob with this calculation.

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

//    2. In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//
//    Examples
//      highAndLow("1 2 3 4 5")  // return "5 1"
//      highAndLow("1 2 -3 4 5") // return "5 -3"
//      highAndLow("1 9 3 4 -5") // return "9 -5"
//    Notes
//    All numbers are valid Int32, no need to validate them.
//    There will always be at least one number in the input string.
//    Output string must be two numbers separated by a single space, and highest number is first.

    public static String highAndLow(String numbers) {

        String[] arr = numbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int number = Integer.parseInt(arr[i]);
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        return max + " " + min;
    }

//    3. Make a simple function called greet that returns the most-famous "hello world!".

    public static String greet () {
        return "hello world!";
    }

//    4. You are given two interior angles (in degrees) of a triangle.
//          Write a function to return the 3rd.
//          Note: only positive integers will be tested.

    public static int otherAngle(int angle1, int angle2) {
        return 180 - (angle1+ angle2);
    }

//    5. Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates
//    and the paperwork has 'm' pages.
//    Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.
//
//    Example:
//    n= 5, m=5: 25
//    n=-5, m=5:  0
//    Waiting for translations and Feedback! Thanks!

    public static int paperWork(int n, int m) {
        int sum = m * n;

        if (n < 0 || m < 0) {
            return 0;
        } else {
            return sum;
        }
    }

//      6. Task:
//      Your task is to write a function which returns the sum of following series upto nth term(parameter).
//
//      Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
//      Rules:
//      You need to round the answer to 2 decimal places and return it as String.
//      If the given value is 0 then it should return 0.00
//      You will only be given Natural Numbers as arguments.
//
//      Examples:(Input --> Output)
//      1 --> 1 --> "1.00"
//      2 --> 1 + 1/4 --> "1.25"
//      5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"

    public static String seriesSum(int n) {

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) 1 / (1 + (3 * i));
        }
        return String.format("%.2f", sum);
    }

//      7. Complete the function so that it finds the average of the three scores passed to it and
//      returns the letter value associated with that grade.
//
//      Numerical Score	Letter Grade
//      90 <= score <= 100	'A'
//      80 <= score < 90	'B'
//      70 <= score < 80	'C'
//      60 <= score < 70	'D'
//      0 <= score < 60	'F'
//      Tested values are all between 0 and 100. Theres is no need to check for negative values
//      or values greater than 100.

    public static char getGrade(int s1, int s2, int s3) {

        int averageScore = (s1 + s2 + s3) / 3;

        if (90 <= averageScore && averageScore <= 100) {
            return 'A';
        } else if (80 <= averageScore && averageScore <= 90) {
            return 'B';
        } else if (70 <= averageScore && averageScore <= 80) {
            return 'C';
        } else if (60 <= averageScore && averageScore <= 70) {
            return 'D';
        } else {
            return 'F';
        }
    }

//      8. You are given an odd-length array of integers, in which all of them are the same,
//      except for one single number.
//      Complete the method which accepts such an array, and returns that single different number.
//      The input array will always be valid! (odd-length >= 3)
//
//      Examples
//      [1, 1, 2] ==> 2
//      [17, 17, 3, 17, 17, 17, 17] ==> 3

    static int stray(int[] numbers) {
        int commonNumber;

        if (numbers[0] == numbers[1]) {
            commonNumber = numbers[0];
        } else if (numbers[0] == numbers[2]) {
            commonNumber = numbers[0];
        } else {
            commonNumber = numbers[1];
        }

        for (int number : numbers) {
            if (number != commonNumber) {
                return number;
            }
        }
        return -1;
    }

//      9. You probably know the "like" system from Facebook and other pages. People can "like" blog posts,
//      pictures or other items. We want to create the text that should be displayed next to such an item.
//
//      Implement the function which takes an array containing the names of people that like an item.
//      It must return the display text as shown in the examples:
//
//      []                                -->  "no one likes this"
//      ["Peter"]                         -->  "Peter likes this"
//      ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//      ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//      ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
//      Note: For 4 or more names, the number in "and 2 others" simply increases.

    public static String whoLikesIt(String... names) {

        if (names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return names[0] + " likes this";
        } else if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and "+ (names.length - 2) + " others like this";
        }
    }

//      10. Consider an array/list of sheep where some sheep may be missing from their place.
//      We need a function that counts the number of sheep present in the array (true means present).
//      For example,
//
//      [true,  true,  true,  false,
//      true,  true,  true,  true ,
//      true,  false, true,  false,
//      true,  false, false, true ,
//      true,  true,  true,  true ,
//      false, false, true,  true]
//      The correct answer would be 17.
//
//      Hint: Don't forget to check for bad values like null/undefined

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == null) {
                break;
            }
            if (arrayOfSheeps[i]) {
                count++;
            }
        }
        return count;
    }

//    11. It's pretty straightforward. Your goal is to create a function that removes the first and last characters
//    of a string. You're given one parameter, the original string. You don't have to worry with strings
//    with less than two characters.

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

//      12. Given an array of integers.
//      Return an array, where the first element is the count of positives numbers and the second element
//      is sum of negative numbers. 0 is neither positive nor negative.
//      If the input is an empty array or is null, return an empty array.
//
//      Example
//      For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

    public static int[] countPositivesSumNegatives(int[] input) {

        int sum1 = 0;
        int sum2 = 0;

        if (input == null || input.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                sum1++;
            }
            if (input[i] < 0) {
                sum2 += input[i];
            }
        }
        return new int[] {sum1, sum2}; //return an array with count of positives and sum of negatives
    }

//      13. Nathan loves cycling.
//      Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
//      You get given the time in hours and you need to return the number of litres Nathan will drink,
//      rounded to the smallest value.
//
//      For example:
//      time = 3 ----> litres = 1
//      time = 6.7---> litres = 3
//      time = 11.8--> litres = 5

    public int liters(double time) {
        return (int)(time * 0.5);
    }

//    14. When provided with a number between 0-9, return it in words.
//    Input :: 1
//    Output :: "One".
//    If your language supports it, try using a switch statement.

    public static String switchItUp(int number) {

        switch (number) {
            case 1:  return ("One");
            case 2:  return("Two");
            case 3:  return("Three");
            case 4:  return("Four");
            case 5:  return("Five");
            case 6:  return("Six");
            case 7:  return("Seven");
            case 8:  return("Eight");
            case 9:  return("Nine");
            case 10:  return("Ten");

            default: return("Zero");
        }
    }

//    15. Who remembers back to their time in the schoolyard, when girls would take a flower and tear
//    its petals, saying each of the following phrases each time a petal was torn:
//
//      "I love you"
//      "a little"
//      "a lot"
//      "passionately"
//      "madly"
//      "not at all"
//      If there are more than 6 petals, you start over with "I love you" for 7 petals,
//      "a little" for 8 petals and so on.
//      When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.
//
//      Your goal in this kata is to determine which phrase the girls would say at the last petal for a flower
//      of a given number of petals. The number of petals is always greater than 0.

    public static String howMuchILoveYou(int nbPetals) {

        if (nbPetals % 6 == 1) {
            return "I love you";
        }
        if (nbPetals % 6 == 2) {
            return "a little";
        }
        if (nbPetals % 6 == 3) {
            return "a lot";
        }
        if (nbPetals % 6 == 4) {
            return "passionately";
        }
        if (nbPetals % 6 == 5) {
            return "madly";
        }
        return "not at all";
    }






}
