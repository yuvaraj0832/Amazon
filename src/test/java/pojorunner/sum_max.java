package pojorunner;

public class sum_max {
	public static void  main(String args[]) {
	int a[] = new int[] {10,20,300,40,50,100};
	int max=a[1];
	for(int i=0; i<a.length; i++) {
		if(a[i]>max) {
			max=a[i];
		
		}
		
	}
	System.out.println(max);
}
}

	


