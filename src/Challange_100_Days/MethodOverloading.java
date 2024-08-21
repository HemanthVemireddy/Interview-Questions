package Challange_100_Days;

public class MethodOverloading
{
    public  int add(int firstName, int SecoundName)
    {
        return firstName+SecoundName;
    }
    public String add(String firstName, String SecoundName)
    {
      return  firstName+SecoundName;
    }
    public int add(int firstName, int SecoundName, int thirdName)
    {
      return firstName+SecoundName+thirdName;
    }

    public static void main(String[] args)
    {
        MethodOverloading methodOverloadingObject = new MethodOverloading();
        System.out.println("Addition of 2 Numbers is : "+methodOverloadingObject.add(10,30));
        System.out.println("Addition of 3 Numbers is :"+methodOverloadingObject.add(10,30,90));
        System.out.println("Concatination of two strings :"+methodOverloadingObject.add("One","Two"));

    }
}
