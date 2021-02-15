package rts;

import java.util.Scanner;

public class RTS2 {
    
    public static String STR = "MyString";
    
    public static void main(String[] args) {
        int input = GetInput();
        
        for(int i = 0; i<input; i++){
            STR = STR.substring(STR.length()-1) + STR.substring(0,STR.length()-1);
        }
        
        System.out.println(STR);
    }
    
    public static int GetInput() {
        Scanner input = new Scanner(System.in);       
        System.out.print("Please input a number: ");
        return input.nextInt();
    }
}
