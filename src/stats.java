import java.util.Scanner;
public class stats {
	Scanner sc= new Scanner(System.in);
	
	
	int [] cal(char c[]) {
		int l=c.length;
		int p,a,m,n,k;
		p=0;a=0;m=0;n=0;
		for(int i=0;i<l;i++) {
			if(c[i]=='P')
				p++;
			else if(c[i]=='A')
				a++;
			else if(c[i]=='M')
				m++;
			else if(c[i]=='N')
				n++;
			else k=0;
		}
		int t,h;
		int x[]=new int[5];
		t=l-n;
		h=t-m;
		double d=(p*100)/h;
		int q=(int)d;
		x[0]=t;
		x[1]=m;
		x[2]=h;
		x[3]=p;
		x[4]=q;
		return x;
	}
	char [] input()
	{
		System.out.println("---------------------------------");
		System.out.printf("%7s %2s %10s %10s","WELCOME", "TO", "ATTENDANCE", "CALCULATOR");
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();System.out.println();
		System.out.println("1. 'P' for present");
		System.out.println("2. 'A' for absent");
		System.out.println("3. 'M' for Mass Bunk");
		System.out.println("4. 'N' for no class");
		System.out.println();System.out.println();
		
		System.out.println("Enter the number of days:");
		int n=sc.nextInt();
		char a[]= new char[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter for date "+(i+1)+" Jan");
			a[i]=sc.next().charAt(0); 
		}
		return a;
		
	}
	
	void print(int [] c, char []a) {
		System.out.println("---------------------------------");
		System.out.println("Date          Status");
		System.out.println("---------------------------------");
		int l=a.length;
		for(int k=0;k<l;k++) {
			System.out.println((k+1)+"        "+"        "+a[k]);
		}
		//printing the stats
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("Scheduled number of classes= "+c[0]);
		System.out.println("Number of mass bunks = "+c[1]);
		System.out.println("Number of classes held= "+c[2]);
		System.out.println("Attended classes = "+c[3]);
		System.out.println("Attendace %age till now="+c[4]+" %");
		
	}
	
	public static void main(String args[]) {
		
		stats ob=new stats();
		char []a=ob.input();
		int b[]=ob.cal(a);
		ob.print(b,a);
	}

}
