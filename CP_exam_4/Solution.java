public class Solution
{
	static int[] dec(int n)
    {
        int[] arr = new int[8];
        int i = 0;
        while (n > 0) 
        {
            
            arr[i] = n % 2;
            
            n = n / 2;
            
            i++;
        }
        
        return arr;
    }
    static void res(int x)
    {
    	int c;
    	int[] arr2=new int[x+1];
    	for (int i=0;i<=x;i++) 
    	{
    		int[] arr1=dec(i);
    		c=0;

		   for (int j = 0; j <arr1.length; j++)
		   {
		   	
		   	if(arr1[j]==1)
		   	{
		   		c=c+1;
		   	}
            
           }
           arr2[i]=c;
       }
       System.out.print("[");
       for (int i=0;i<arr2.length ;i++ ) {

       	if (i!=arr2.length-1) {
       		System.out.print(arr2[i]+",");
       		
       	}
       	else
       	{
       		System.out.print(arr2[i]);
       	}
       	
       	
       }
       System.out.print("]");
       System.out.println("");
           
           

    }
  
        
     
	public static void main(String[] args) {
		
		res(15);
		res(16);
		res(1);
		res(25);
		
		res(5);
		res(6);
		

	}
}