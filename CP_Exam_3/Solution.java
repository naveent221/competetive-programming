public class Solution
{
	static int[] dec(int n)
    {
        
        int[] arr = new int[8];
        int i = 0;
        while (n > 0) 
        {
            
            arr[i] = n % 2;
            //System.out.println(arr[i]);
            n = n / 2;
            //System.out.println(n);
            i++;
        }
        //int z=arr.length/arr[0];
        //System.out.print(z);
        //int k=i-1;
        //System.out.println(k);
        // while(k!=7)
        // {
        // 	arr[k]=0;
        // 	k++;
        // 	//System.out.println(k);

        // }
        return arr;
    }
    static void res(int x,int y)
    {
    	int[] arr1=dec(x);
		   
		int[] arr2=dec(y);
		int c=0;
		   for (int j = 7; j >= 0; j--)
		   {
            if(arr1[j]!=arr2[j])
            {
            	c=c+1;
            }
           }
           System.out.println(c);

    }
  
        
     
	public static void main(String[] args) {
		
		res(25,30);
		res(1,4);
		res(100,250);
		res(1,30);
		res(0,255);
		

	}
}