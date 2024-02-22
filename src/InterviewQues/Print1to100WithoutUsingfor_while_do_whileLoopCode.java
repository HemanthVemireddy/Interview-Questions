package InterviewQues;

public class Print1to100WithoutUsingfor_while_do_whileLoopCode {
    public static void main(String[] args)
    {
        withoutLoop(1,100);
    }
    public static void withoutLoop(int strNum, int EndNum)
    {
        if(strNum <= EndNum)
        {
            System.out.println(strNum);
            strNum++;
            withoutLoop(strNum, EndNum);
        }
    }
}
