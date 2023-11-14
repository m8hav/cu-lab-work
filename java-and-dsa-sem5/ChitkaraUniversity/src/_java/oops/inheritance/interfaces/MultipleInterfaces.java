package _java.oops.inheritance.interfaces;

interface A
{
    public void cq1();
}
interface B
{
    public int cq1();
}
// can't implement both faces here
//class Main implements A, B
class Main implements A
{
    public void cq1()
    {
        System.out.println("CQ");
    }
//    public int cq1()
//    {
//        System.out.println("CQ");
//        return 0;
//    }
}
public class MultipleInterfaces {
    public static void main(String args[])
    {
        Main o1 = new Main();
        o1.cq1();
    }
}
