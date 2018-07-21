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
    	int[] arr1=dec(x);
		   
		
		int c=0;
		   for (int j = 0; j <arr1.length; j++)
		   {
		   	System.out.println(arr1[j]);
            
           }
           

    }
  
        
     
	public static void main(String[] args) {
		
		//res(0);
		//res(55);
		//res(-5);
		//res(12354);
		res(6);
		

	}
}