public class Solution2 {

    public static int[] getPro(int[] intArray) {

    if (intArray.length < 2) {
        throw new IllegalArgumentException("Atleast enter 2 numbers");
    }
  
    int[] pro = new int[intArray.length];
    int count = 1;
    for (int i = 0; i < intArray.length; i++) {
        pro[i] = count;
        count *= intArray[i];
    }
    count = 1;
    for (int i = intArray.length - 1; i >= 0; i--) {
        pro[i] *= count;
        count *= intArray[i];
    }

          return pro;
    }

    public static void main(String[] args) {
        int[] arr={4,0,9,1,0};
        int[] a=new int[arr.length];
        a=getPro(arr);
        for (int i=0;i<a.length ;i++ ) {
            System.out.print(a[i]+" ");
            
        }
    }
}