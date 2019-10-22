import java.util.Arrays;

public class main 
{
	static final int x=42;
	static int a[]=new int[101];
	static int zaehlerseq=0;
	static int zaehlerbin=0;
	public static void main(String[] args) 
	{
		for(int i=0;i<a.length;i++)
		{
			a[i] = (int)(Math.random() * a.length);
		}
		Arrays.sort(a);
		/*for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		if(seqsuche(a, x)) System.out.println("Sequenzielle Suche: Die Zahl ("+x+") ist im Array a enthalten! Es wurden "+zaehlerseq+" Versuche benötigt!");
		else System.out.println("Sequenzielle Suche: Die Zahl ("+x+") ist nicht im Array a enthalten!");
		if(binsuche(a, x)) System.out.println("Binäre Suche: Die Zahl ("+x+") ist im Array a enthalten! Es wurden "+zaehlerbin+" Versuche benötigt!");
		else System.out.println("Binäre Suche: Die Zahl ("+x+") ist nicht im Array a enthalten!");
	}

	public static boolean binsuche(int[] a,int x) //Binärsuche
	{
		int minindex=0;
		int maxindex=a.length-1;
		int midindex;
		while(minindex <= maxindex)
		{
			midindex = (minindex + maxindex)/2;
			if(a[midindex] > x)
			{
				maxindex = midindex-1;
				zaehlerbin++;
			}
			else if (a[midindex] < x) 
			{
				minindex = midindex+1;
				zaehlerbin++;
			}
			else
			{
				return true;
			}
		}
		return false;
	}

	public static boolean seqsuche(int a[],int x) //Sequenzielle Suche
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x) 
			{
				zaehlerseq=i+1;
				return true;
			}
		}
		return false;
	}

}
