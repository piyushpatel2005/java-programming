package com.piyushpatel2005.conditionalblocks;

public class SwitchCase {
    public static void main(String[] args) {
        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Value was " + switchValue);
                break;
            case 2:
            case 3:
                System.out.println("Value was " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2 or 3: " + switchValue);
                break;
        }
    }

    public static void printNumberInWord(int number) {
        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}
