/*Carrom



Mithun is an avid player of the carrom game, and he wants a quick way to calculate the score after each round. He has a unique scoring system based on the number and type of coins scored in a round.



Write a program named Carrom that takes two inputs:

An integer number representing the number of coins scored in a carrom round (1 to 9).
A character c represents the type of bonus. If c is 'r', Mithun adds 5 points to the score; otherwise, he keeps the score unchanged.


If the number is less than 1 or greater than 9, the program should output "Invalid Input". Otherwise, it should calculate and print the final score.

Input format :
The first line of input consists of an integer, n, representing the number of coins scored (1 to 9).

The second line of input consists of a character c representing the type of bonus ('r' or any other character).

Output format :
The output displays the following format:



If the number is less than 1 or greater than 9, print "Invalid Input."

If c is 'r', add 5 to the number and print the result.

If c is not 'r', print the number as is.*/


import java.util.Scanner;

class com{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
        int num= sc.nextInt();
        char c = sc.next().charAt(0);
        if(num < 1 || num > 9){
            System.out.println("Invalid Input");
               
        }else{
            
            
        if(c == 'r'){
           
             int a = num + 5;
                System.out.println(a);
        }else{
            System.out.println(num);
        }
        }
        } catch (Exception e){
            System.out.println("");
        }
}
}
