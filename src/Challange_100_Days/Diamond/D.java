package Challange_100_Days.Diamond;

public class D  extends B
{
    public static void main(String args[])
    {
        D d = new D();
     //creates ambiguity which display() method to call
        d.display();
    }
}
