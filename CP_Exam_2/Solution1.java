import java.util.*;

public class Solution1
{
	public static void fun(String s10,String s20)
{
	    String s1=s10.toLowerCase().replaceAll(" ","");
		String s2=s20.toLowerCase().replaceAll(" ","");;
		int c=0;
		if(s1.length()!=s2.length())
		{
			System.out.println("false");
			
		}
		else
		{
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			for(int i=0;i<c1.length;i++)
			{
				if(c1[i]==c2[i])
				{
					c=c+1;
				}
				else
				{
					System.out.println("false");
					break;
				}
			}
			if(c==c1.length)
			{
				System.out.println("true");
			}
		}

}
	public static void main(String[] args) {
		fun("anagram","nagaram");
		fun("keep","peek");
		fun("Mother In Law","Hitler Woman");
		fun("School Master","The Classroom");
		fun("ASTRONOMERS","NO MORE STARS");
		fun("Toss","shot");
		fun("joy","enjoy");
		fun("Debit Card","Bad Credit");
		fun("SiLeNt CAT","LisTen AcT");
		
		fun("Dormitory","Dirty Room");
		
	}
}