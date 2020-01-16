import java.util.Scanner;
public class calfun {
	@SuppressWarnings({ "unused", "resource" })
	public static void main (String args[]) {
		System.out.println("---------------------------------");
		System.out.printf("%7s %2s %10s %10s","WELCOME", "TO", "ATTENDANCE", "CALCULATOR");
		Scanner sc= new Scanner(System.in);
		int date[]=new int[5];
		char ch[]= new char[5];//for storing attendance
		int p=0; int n=0;
		int a=0;
		int m=0;
		int t=0;
		String day[]= {"Monday   ","Tuesday  ","Wednesday","Thursday ","Friday   "};
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();System.out.println();
		System.out.println("1. 'P' for present");
		System.out.println("2. 'A' for absent");
		System.out.println("3. 'M' for Mass Bunk");
		System.out.println("4. 'N' for no class");
		System.out.println();System.out.println();System.out.println();System.out.println();
		for(int i=0;i<5;i++) {
			t++; //to find total number of classes
			date[i]=i+1;
			System.out.println("For Date :"+date[i]+" Day " +day[i]);
			char cha=sc.next().charAt(0); 
			{ch[i]=cha;}
		}
		for(int j=0;j<5;j++) {      //for loop to count present, absents and bunks
			char chr1=ch[j];
			if(chr1=='P')
				p++;
			else if(chr1=='A')
				a++;
			else if(chr1=='M')
				m++;
			else if(chr1=='N')
				n++;
		}
		System.out.println("---------------------------------");
		System.out.println("Date        Day        Status");
		System.out.println("---------------------------------");
		for(int k=0;k<5;k++) {
			System.out.println(date[k]+"        "+day[k]+"        "+ch[k]);
		}
		//printing the stats
		System.out.println("---------------------------------");
		System.out.println();System.out.println();System.out.println();
		int T=t-n;
		int l=T-m;
		double per;
		per=(p*100)/l;
		System.out.println("Scheduled number of classes= "+T);
		System.out.println("Number of mass bunks = "+m);
		System.out.println("Number of classes held= "+l);
		System.out.println("Attended classes = "+p);
		System.out.println("Attendace %age till now="+per+" %");
		double min=(l*3)/4;
		int lec;
		if(min%10==0)
			lec=(int)min;
		else
			lec=(int)min+1;
		int sh=lec-p;
		if(sh>0)
			System.out.println("Number of short classes= "+sh);
		else
			System.out.println("Not Detained");
		
		
	}
}