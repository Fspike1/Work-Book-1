import java.util.Scanner;

public class MathThings {
    public static void main(String[] args) {
        int num = -45;
        Math.abs(num);
        System.out.println(Math.abs(num));

        double num2 = 3.5;
        double num1= 7.8;
        System.out.println(Math.max(3.5 , 7.8));

        int num3 = 99;
        int num4 = 23;
        System.out.println(Math.min(num3 , num4));

        double var1 = 8.9;
        System.out.println(Math.floor(var1));

        double var2 = 5.2;
        System.out.println(Math.ceil(var2));


        double var5 = 9.6;
        System.out.println(Math.round(var5));

        double morningtemp = -3.7;
        double afternoontemp = 12.4;
        System.out.println(Math.abs(morningtemp - afternoontemp));
        System.out.println(Math.max(morningtemp , afternoontemp));
        System.out.println(Math.min(morningtemp , afternoontemp));
        System.out.println(Math.round(afternoontemp));
        System.out.println(Math.floor(morningtemp));

        double price = 10.876;
        double roundedUp = Math.ceil(price * 100)/100;
        System.out.println(roundedUp);


        double price1 = 3.87;
        double roundDown = Math.floor(price1* 100)/100;
        System.out.println(roundDown);

















    }}
