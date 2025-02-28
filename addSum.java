/*Create a program that reads two integer values, x and y, from the standard input and calculates their sum. Then, it should output the result as a double.



Your task is to implement this program.

Input format :
The input consists of two integer values, x and y, separated by a space.

Output format :
The output displays a single double value, which represents the sum of x and y*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c;
        c = a + b;
        System.out.println(c);
    }
}
