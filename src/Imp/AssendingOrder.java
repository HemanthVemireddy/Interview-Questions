package Imp;

public class AssendingOrder
{
    public static void meto(int[] name)
    {
        int temp = 0;
        for(int i = 0; i < name.length; i++)
        {
            for(int j = i+1; j< name.length; j++)
            {
                if (name[i] < name[j])
                {
                    temp = name[i];
                    name[i]= name[j];
                    name[j] = temp;
                }
            }

        }
        System.out.println("");
        for(int k = 0; k < name.length; k++)
        {
            System.out.print(name[k]+" ");
        }
    }
    public static void main(String[] args)
    {
        int [] name = {1,4,5,88,3,99};
        meto(name);
    }
}
