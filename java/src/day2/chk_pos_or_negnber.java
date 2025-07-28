package day2;
import java.util.Scanner;
public class chk_pos_or_negnber {
	  public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input number: ");
	        int input = in.nextInt();

	        if (input > 0)
	        {
	            System.out.println("Number is positive");
	        }
	        else if (input < 0)
	        {
	            System.out.println("Number is negative");
	        }
	        else
	        {
	            System.out.println("Number is zero");
	        }
	    }
	}

