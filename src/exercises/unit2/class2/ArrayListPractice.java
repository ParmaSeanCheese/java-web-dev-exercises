package exercises.unit2.class2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            intArr.add(i);
        }
        System.out.println(sumEven(intArr));

        ArrayList<String> stringArr = new ArrayList<>();
        stringArr.add("cat");
        stringArr.add("fiver");
        stringArr.add("dog");
        stringArr.add("llama");

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Search Length: ");
        int searchLength = input.nextInt();

        fiveLetters(stringArr, searchLength);

    }

    public static int sumEven(ArrayList<Integer> arr){
        int sum = 0;
        for (Integer i : arr){
            sum += i;
        }
        return sum;
    }

    public static void fiveLetters(ArrayList<String> arr, Integer length){
        for (String word : arr){
            if (word.length() == length){
                System.out.println(word);
            }
        }
    }
}
