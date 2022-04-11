package com.company;

public class Main {

    static int[] arr = new int[30];

    public static void main(String[] args) {
        generateRandomArray();
        System.out.println("—умма трат за мес€ц составила " + task1() + " рублей");
        task2();
        task3();
        task4();

    }

    static void generateRandomArray() {
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
    }

    static int task1() {
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        return sum;
    }
    static void task2() {
        int min = 200000;
        int max = 0;
        for(int element : arr) {
            if(min > element) {
                min = element;
            }
            if(max < element) {
                max = element;
            }

        }
        System.out.println("ћинимальна€ сумма трат за день составила " + min + " рублей. ћаксимальна€ сумма трат за день составила " + max + " рублей");
    }
    static void task3() {
        double middle = task1() / 30.0;
        System.out.println("—редн€€ сумма трат за мес€ц составила " + middle + " рублей.");
    }
    static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int  i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        int j = reverseFullName.length-1;


        /* for(int i = 0; i < reverseFullName.length; i++) { //If i should change the array. I know about replace method:)
            if(i == j) {
                break;
            }
            char frstElement = reverseFullName[i];
            char lastElement = reverseFullName[j];
            reverseFullName[i] = lastElement;
            reverseFullName[j] = frstElement;
            j--;

        }
        System.out.print(new String(reverseFullName)); */


    }
}