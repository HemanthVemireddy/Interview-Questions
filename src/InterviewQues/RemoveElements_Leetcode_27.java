package InterviewQues;

public class RemoveElements_Leetcode_27 {
    public static void main(String[] args)
    {
        int num1[] = {1,3,4,5,4,7,8,4};
        int m = 4;
        System.out.println(RemoveNum(num1, m));
    }
    public static int RemoveNum(int[] num, int m) {
        int count = 0;
        System.out.println("Length of the Array \t:" + count);
        int i;
        for (i = 0; i < num.length; i++) {
            if (num[i] != m)
            {
                num[count] = num[i];
                count++;
                System.out.print(num[i]);
            }
        }
        return count;

    }
}
