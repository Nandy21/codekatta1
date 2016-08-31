import java.util.Arrays;
import java.util.Scanner;


public class repeatedno {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[10];
		int[] b=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				b[i]=a[i];
			}
		}
		for(int k=0;k<a.length;k++)
		{
			if(b[k]!=0)
			{
				System.out.println(b[k]);
			}
		}

	}

}
