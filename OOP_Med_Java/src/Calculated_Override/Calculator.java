package Calculated_Override;

import java.util.ArrayList;

//This exercise is just to learn how method can return values and how to call upon them. 
//Also a early insight in how you build application loosely coupled.

public class Calculator {
    
    public static void main(String[] args) throws Exception {
        System.out.println(firstAdd());

        System.out.println(secondAdd());

        System.out.println(thirdAdd());
    }

    public static int firstAdd() {
        int tal1 = 5;
        int tal2 = 5;
        int total;

        total = tal1 + tal2;
        
        return total;
    }
    public static double secondAdd() {
        double tal1 = 10;
        double tal2 = 100;
        double total;

        total = tal1 + tal2;

        return total;
    }

    public static int thirdAdd(){
        ArrayList <Integer> nummer = new ArrayList<>();

        nummer.add(50);
        nummer.add(50);
        nummer.add(50);

        int total = 0;
        for (int num : nummer) {
            total += num;
        }
        
        return total;

    }

}
