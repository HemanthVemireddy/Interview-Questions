package InterviewQues;

public class RotateArray {
    static void rotateONE(int[] a)
    {
        int temp = a[0];
        for(int i = 1; i < a.length; i++)
        {
            a[i-1] = a[i];
        }
        a[a.length-1] = temp;
    }

    static void rotateArray(int[] a, int k)
    {
        k = k % a.length;
        if(k < 0)
        {
            k = k+a.length;
        }
        for (int i = 1; i <= k; i++)
        {
            rotateONE(a);
        }
    }
    public static void main(String[] args)
    {
        int [] a = {1,2,3,4,5,6,7};
        for (int i = 0; i < a.length;i++)
        {
            System.out.print("\t"+a[i]);
        }
        System.out.println("");
        rotateArray(a, 4);
        for (int i = 0; i < a.length;i++)
        {
            System.out.print("\t"+a[i]);
        }
    }
}
