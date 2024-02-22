package InterviewQues;

public class MergeSortedArray_LeetCode_88 {

    public static void main(String[] args)
    {
        int num1[] = {1,2,3,0,0,0};
        int num2[] = {2,5,6};
        int m = 3;
        int n = 3;
        MergeArrays(num1,num2,m,n);
        for(int i = 0; i<m+n; i++)
        {
            System.out.print(num1[i]);
        }

    }
    public static void MergeArrays(int[] num1, int[] num2, int m, int n)
    {
        int i = m - 1;  // 3 - 1 = 2;
        int j = n - 1; // 3 - 1 = 2;
        int k = m + n - 1; // 6 - 1 = 5

        while (j >= 0)
        {
            if (i >= 0 && num1[i] > num2[j])
            {
                num1[k] = num1[i];
                i--;
                k--;
            }
            else
            {
                num1[k] = num2[j];
                j--;
                k--;
            }
        }
    }

}

/*
Explanation
k = i + j - 1 = 7 + 3 - 1 = 9
num1 = [1,2,3,4,0,0,0] && num2 = [9,8,7]
              i                        j
num1[i] > num2[j]  4 > 7
num1[k] = num1[i]   num1[9] = num1[i]
num1[k] = num2[j]   num1[9] = 7


 */
