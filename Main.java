import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        //two numbers , takes two numbers as input
        //A1.

//        System.out.print("Input first number: ");
//        int firstNum = input.nextInt();
//        System.out.print("Input second number: ");
//        int secondNum = input.nextInt();
//        int multiply = firstNum * secondNum;
//        int subtract = firstNum - secondNum;
//        int addition = firstNum + secondNum;
//        int divide = firstNum / secondNum;
//        int remainder = firstNum % secondNum;
//        System.out.println(firstNum + " + "  + secondNum + " = " + addition );
//        System.out.println(firstNum + " - " + secondNum + " = " + subtract );
//        System.out.println(firstNum + " * " + secondNum + " = " + multiply );
//        System.out.println(firstNum + " / " + secondNum + " = " + divide );
//        System.out.println(firstNum + " mod " + secondNum + " ="  + remainder );

        // Here i used simple way to make calculator and i aks user to put two numbers

        // ////////////////////////////////////////////////////////////////////////////

        //2. Write a Java program that takes a number as input and prints its multiplication table up to
        //10.

        //A2.

//        System.out.print("Enter number : ");
//        int num01 = input.nextInt();
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + " * " + num01 + " = " +(i * num01));
//            i++;
//           }

        // ///////////////////////////////////////////////////////////////////////////

        //3. Write a Java program to print the area and perimeter of a circle.

        //A3.
//        System.out.print("Enter number of radius = ");
//        double radius = input.nextDouble();
//        double perimeter = 2 * 3.14 * radius;
//        double area = 3.14 * (Math.pow(radius,2));
//        System.out.println("perimeter is " + perimeter);
//        System.out.println("Area is " + area);

        // ///////////////////////////////////////////////////////////////////////////

        //4. Java program to find out the average of a set of integers

        //A4.

//        System.out.print("Enter the count of numbers: ");
//        int count = input.nextInt();
//        double sum = 0;
//        for (int i = 0; i < count; i++) {
//            System.out.print("Enter an integer: ");
//            int num02 = input.nextInt();
//            sum += num02;
//
//
//        }
//        System.out.println("The average is: " + (sum / count));

        // ///////////////////////////////////////////////////////////////////////////

        // 5. Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.

        //A5.

//        System.out.print("Input the first number : ");
//        int firstNum01 = input.nextInt();
//        System.out.print("Input the second number: ");
//        int secondNum01 = input.nextInt();
//        System.out.print("Input the third number : ");
//        int thirdNum01 = input.nextInt();
//        if (firstNum01 + secondNum01 == thirdNum01){
//            System.out.println("The result is: true ");
//        }else System.out.println("The result is: false ");

        // ///////////////////////////////////////////////////////////////////////////

        // 6. Write a Java program to reverse a word.

        //A6.
//        System.out.print("Input a word: ");
//        String word = input.nextLine();
//        String reverse = "";
//        for (int i = word.length() -1; i >=0  ; i--) {
//            reverse += word.charAt(i);
//
//        }
//        System.out.println("Reverse word: " + reverse);

        // ///////////////////////////////////////////////////////////////////////////

        // 7 - Java program to check whether the given number is even or odd

        //A7.

//        System.out.print("Enter a number: ");
//        int num03 = input.nextInt();
//        if(num03 % 2 == 0){
//            System.out.println("The number is Even ");
//        }else System.out.println("The number is Odd");

        // ///////////////////////////////////////////////////////////////////////////

        // 8 - Java program to convert the temperature in Centigrade to Fahrenheit

        //A8.

//        System.out.print("Enter temperature in Centigrade: ");
//        int centigrade = input.nextInt();
//        double toFahrenheit = centigrade * 9/5 + 32;
//        System.out.println("Temperature in Fahrenheit is: " + toFahrenheit);


        // ///////////////////////////////////////////////////////////////////////////

        // 9.Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index.

        //A9.

//        System.out.print("Input a string: ");
//        String phrase = input.nextLine();
//        System.out.print("Input a number: ");
//        int num04 = input.nextInt();
//        char char1 = phrase.charAt(num04);
//        System.out.println("The letter : "+char1);

        // ///////////////////////////////////////////////////////////////////////////

        // 10. Write a Java program to print the area and perimeter of a rectangle.

        // A10.

//        System.out.print("Input the Width = ");
//        double width = input.nextDouble();
//        System.out.print("Input the Height = ");
//        double height = input.nextDouble();
//        double area01 = width * height;
//        double perimeter = 2 * (width + height);
//        System.out.println("Area is : " + area01);
//        System.out.println("Perimeter is : " + perimeter);



        // ///////////////////////////////////////////////////////////////////////////

        //11. Write a Java program to compare two numbers.

        //A11.
//        System.out.print("Input first integer: ");
//        int num05 = input.nextInt();
//        System.out.print("Input second integer: ");
//        int num06 = input.nextInt();
//        if(num05 < num06 && num05 != num06 && num05 <= num06){
//            System.out.println( num05 +" != " + num06);
//            System.out.println( num05 +"  <  " + num06);
//            System.out.println( num05 +" <= " + num06);
//
//        }else if(num06 < num05 && num06 != num05 && num06 <= num05) {
//            System.out.println(num05 + " != " + num06);
//            System.out.println(num05 + "  >  " + num06);
//            System.out.println(num05 + " >= " + num06);
//        }

        // ///////////////////////////////////////////////////////////////////////////

        //12. Write a Java program to convert seconds to hours, minutes and seconds.

        //A12.
//        System.out.print("Input seconds: ");
//        int sec = input.nextInt();
//        int hour = sec / 3600;
//        int min = sec % 60;
//        System.out.println(hour + ":" + min +":" + sec%60);


        // ///////////////////////////////////////////////////////////////////////////

        //13. Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise.

        //A13.

//        System.out.print("Input first number: ");
//        int firstNum02 = input.nextInt();
//        System.out.print("Input second number: ");
//        int secondNum02 = input.nextInt();
//        System.out.print("Input third number: ");
//        int thirdNum02 = input.nextInt();
//        System.out.print("Input fourth number: ");
//        int fourthNum01 = input.nextInt();
//        if (firstNum02 == secondNum02 && firstNum02 == thirdNum02 && firstNum02 ==fourthNum01 ){
//            System.out.println("Numbers are equal! ");
//        }else System.out.println("Numbers are not equal! ");

        // ///////////////////////////////////////////////////////////////////////////

        //14. Write a Java program that reads an integer and check whether it is negative, zero, or
        //positive.

        //A14.
//        System.out.print("Input a number: ");
//        int num06 = input.nextInt();
//        if(num06 > 0 ){
//            System.out.println("Number is positive ");
//        } else if (num06<0) {
//            System.out.println("Number is  negative ");
//        }else System.out.println("Is ZERO");

        // ///////////////////////////////////////////////////////////////////////////

        //15.Write a program to enter the numbers till the user wants and at the end it
        //should display the count of positive, negative and zeros entered (End loop use -1 ,
        //Don’t count -1).

        //A15.
//
//        int pos = 0;
//        int neg = 0;
//        int zero = 0;
//        int out = -1;
//        while (true){
//            System.out.println("Enter number to know if(positives or zero or negative) or Enter -1 to exit");
//            System.out.print("The number : ");
//           int  num07 = input.nextInt();
//            if( num07==-1){
//                break;
//
//            }else if (num07 < 0){
//                neg++;
//                System.out.println(neg + "negative");
//            }else if (num07 == 0){
//                zero++;
//                System.out.println(zero+"Zero");
//            }else if(num07 > 0){pos++;
//                System.out.println(pos + " positives ");}
//        }

        // ///////////////////////////////////////////////////////////////////////////

        //16 - Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed.

        //A16.

//        System.out.print("the input is ");
//        int num08 = input.nextInt();
//        int revNum01 = 0;
//        while (num08 != 0){
//           int numbers = num08 % 10;
//           revNum01 = revNum01 * 10 + numbers;
//           num08 /= 10;
//
//       }
//        System.out.println("reverse : "+revNum01);



        // ///////////////////////////////////////////////////////////////////////////

        //17 - Write a program to enter the numbers till the user wants and at the end the
        //program should display the largest and smallest numbers entered.

        //A17.
//        int large = -100;
//        int small = 100;
//        int num09 ;
//        while (true){
//            System.out.println("If you want stop press 0");
//            System.out.print("Enter number : ");
//            num09 = input.nextInt();
//            if(num09 > large && num09 != 0){
//                large = num09;
//            } else if ( small > num09 && num09 != 0) {
//                small = num09;
//            } else if (num09 == 0) {
//                System.out.println("The largest number : " + large);
//                System.out.println("The smallest number : " + small);
//                break;
//            }
//
//        }




        /////////////////////////////////////////////

        //18 - Determine and print the number of times the character ‘a’ appears in the input
        //entered by the user.

        //A18.

//        System.out.print("Enter String: ");
//        String str = input.nextLine();
//        int read = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == 'a' ){
//                read++;
//
//            }
//        }
//        System.out.println("Number of a's: "+read);




    }
}