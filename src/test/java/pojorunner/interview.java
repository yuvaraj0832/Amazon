package pojorunner;

import java.util.Scanner;

public class interview {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int  input =sc.nextInt();
		int temp=input;
		int sum=0;
		while(input>0) {
			int rem=input%10;
			sum=sum+rem;
			input=input/10;
			}

int input2 = sum;
int sum2=0;
        while (input2>0) {
        	int rem2=input2%10;
        	sum2=sum2+rem2;
        	input2=input2/10;
        }
        System.out.println(sum2);
        
        	
			
		
	
}
		
}


