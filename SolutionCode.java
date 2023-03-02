//Identify the logic behind the series
//6 28 66 120 190 276….
//The numbers in the series should be used to create a Pyramid. The base of the Pyramid will be the widest 
//and will start converging towards the top where there will only be one element. Each successive layer will 
//have one number less than that on the layer below it. The width of the Pyramid is specified by an input parameter N. 
//In other words there will be N numbers on the bottom layer of the pyramid.
//The Pyramid construction rules are as follows
//	1.	First number in the series should be at the top of the Pyramid
//	2.	Last N number of the series should be on the bottom-most layer of the Pyramid, with Nthnumber being 
//	    the right-most number of this layer.
//	3.	Numbers less than 5-digits must be padded with zeroes to maintain the sanctity of a Pyramid when printed. 
//	    Have a look at the examples below to get a pictorial understanding of what this rule actually means.
//Example
//If input is 2, output will be
//00006
//00028 00066
//If input is 3, output will be
//00006
//00028 00066
//00120 00190 00276
//Formal input and output specifications are stated below
//Input Format:
// 
//	•	First line of input will contain number N that corresponds to the width of the bottom-most layer of the Pyramid
//Output Format:
//	•	The Pyramid constructed out of numbers in the series as per stated construction rules
//Constraints:
//	•	0 < N <= 14

import java.util.*;
public class Pyramid {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the limit of rows ( 1 to 14 ) : ");
		int N = sc.nextInt();
		System.out.println();
		if(N > 0 && N < 15) {
			
			int number = 6, temp = 6;
			for(int a = 1; a <= N; a++ ) {
				
				for(int b = 1; b <= a; b++) {
					if(number < 10000) {
						System.out.print(String.format("%05d",number));
						System.out.print("   ");
					}
					else {
					System.out.print(number+"   ");
					
					}
					temp += 16;
					number += temp;	
				}
				System.out.println("\n");
			}			
		}
	}
}
