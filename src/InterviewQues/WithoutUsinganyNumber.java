package InterviewQues;

public class WithoutUsinganyNumber {
    public static void main(String[] args) {
        int one = 'A' / 'A';
        String s1 = "..........";

        for (int i = one; i <= (s1.length() * s1.length()); i++)
        {
            System.out.print(" " + i);
        }
    }
}
