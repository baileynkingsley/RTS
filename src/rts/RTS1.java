package rts;

import java.util.Scanner;

public class RTS1 {

    public static int[] NUMS = {1, 5, 2, 1, 10};
    
    public static void main(String[] args) {
        int input = GetInput();
        int above = 0;
        int below = 0;
        
        for(int i=0; i<NUMS.length; i++){
            if(input<NUMS[i]){above++;}
            else if (input>NUMS[i]) {below++;}
        }
        
        PrintAboveBelow(above, below);
    }
    
    public static int GetInput() {
        Scanner input = new Scanner(System.in);       
        System.out.print("Please input a number: ");
        return input.nextInt();
    }
    
    public static void PrintAboveBelow(int above, int below) {
        System.out.println("above: " + above + ", below: " + below);    
    }
    
}
