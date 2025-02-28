/*Write a program to display the ASCII value of a character in int, float, byte, and short datatypes.

Input format :
The input consists of a single character, 'ch', representing an uppercase or lowercase alphabet character.

Output format :
If 'ch' is a valid alphabet character, output displays the following lines:



"int: a", where 'a' is the integer representation of the character.

"float: b.0", where 'b' is the float representation of the character.

"byte: c", where 'c' is the byte representation of the character.

"short: d", where 'd' is the short representation of the character.



If 'ch' is not a valid alphabet character, the program should output "Invalid."

*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
         
        String c = Sc.next().trim();
        if(c.length() == 1 && Character.isLetter(c.charAt(0))){
            
        char ch = c.charAt(0);
        int asciiValue = (int) ch;
        System.out.println("int: "+asciiValue);
        System.out.println("float: " + (float)asciiValue);
        System.out.println("byte: "+(byte)asciiValue);
        System.out.println("short: "+(short)asciiValue);
        }else{
            System.out.println("Invalid");
        }
    }
}
