/*Ragav, a detail-oriented person, wants to analyze his expenses across four main categories: Branding, Travel, Food, and Logistics. He needs a program to calculate the total expenses and the percentage of spending in each category relative to the total amount spent.

Input format :
The first line of input is a double, which represents the expense of Branding.

The second line of input is a double, which represents the expense of Travel.

The third line of input is a double, which represents the expense of Food.

The fourth line of input is a double, which represents the expense of Logistics.

Output format :
The output displays the following lines:

"Total expenses : Rs.XX".

"Branding expenses percentage : YY%"..

"Travel expenses percentage : ZZ%".

"Food expenses percentage : WW%".

"Logistics expenses percentage : VV%".*/
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double B,T,F,L;
        B = sc.nextDouble();
        T = sc.nextDouble();
        
        F = sc.nextDouble();
        
        L = sc.nextDouble();
        double S = B + T + F + L ;
        double perb,perl,perf,pert;
        perb = (B/S)*100;
          perl = (L/S)*100;
            perf = (F/S)*100;
              pert = (T/S)*100;
        System.out.printf("Total expenses : Rs.%.2f%n",S);
        System.out.printf("Branding expenses percentage : %.2f%%%n",perb);
        System.out.printf("Travel expenses percentage : %.2f%%%n",pert);
        System.out.printf("Food expenses percentage : %.2f%%%n",perf);
        System.out.printf("Logistics expenses percentage : %.2f%%%n",perl);
    }
    }


//where XX, YY, ZZ, WW, VV, rounded to two decimal places
