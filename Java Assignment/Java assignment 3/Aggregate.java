import java.util.Scanner;
class Aggregate{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int n= sc.nextInt();
		int p[]= new int[n];
		int c[]= new int[n];
		int m[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the marks for Physics, Chemistry and Maths of student: "+i);
			p[i]= sc.nextInt();
			c[i]= sc.nextInt();
			m[i]= sc.nextInt();
		}
		
		int above75 =0;
		int below40 =0;
		int avgstu =0;
		for(int i=0;i<n;i++)
		{
			int total=p[i]+c[i]+m[i];
			double agg= total/3;
			if(agg>=75)
			{
				above75++;
			}
			else if(agg<=40)
			{
				below40++;
			}
			else 
			{
				avgstu++;
			}
		}
		System.out.println(" Number of students securing 75% and above in aggregate: "+ above75);
		System.out.println(" Number of students securing 40% and below in aggregate: "+below40);
		System.out.println(" Number of students securing average: "+avgstu);
		
	}
}