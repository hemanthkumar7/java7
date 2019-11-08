import java.lang.*;
class TwoGen<A,B>{
  A ob1;
  B ob2;
 
TwoGen(A o1,B o2)
{ 
  ob1 =o1;
  ob2 =o2;
}
void showtypes()
{
 System.out.println("type of A is "+ ob1.getClass().getName());
 System.out.println("type of B is "+ ob2.getClass().getName());
}
  A getob1()
{
  return ob1;
}
 B getob2()
{
  return ob2;
}
}
class GenDemo{
public static void main(String args[])
{
 TwoGen<Integer,String> tgobj= new TwoGen<Integer, String>(100,"cat");
  
 tgobj.showtypes();
 int v=tgobj.getob1();
  System.out.println("A is:"+v);

 String str=tgobj.getob2();
 System.out.println("B is:"+ str);
}
}






