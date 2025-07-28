package day2;
import java.util.Arrays;
public class insertanelementintoarray {
	public static void main(String[] args) {
	 int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	 int Index_position = 9;
	 int newValue = 100;
	 System.out.println("Original Array : "+Arrays.toString(my_array));
	 for(int i=my_array.length-1; i > Index_position; i--){
	 my_array[i] = my_array[i-1];
	 }
	 my_array[Index_position] = newValue;
	 System.out.println("New Array: "+Arrays.toString(my_array));
	}
	}

