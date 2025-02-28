/*Imagine you are developing a program for managing and tracking events hosted at Codissia, a popular event venue. The program should take input from the number of events hosted at Codissia and display this information.

Input format :
The input consists of an integer, which represents the number of events.

Output format :
The output should display the number of events to be hosted at Codissia.*/
CODE:::
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Number of events hosted in Codissia is "+a);
    }
}
