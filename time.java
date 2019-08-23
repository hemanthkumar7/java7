import.java.util.*;
class TIME
{ 
 int h,m,s;
TIME ()
{h=0;m=0;s=0;}
TIME(int a,int b, int c);
{ 
 h=a;
 m=b;
 s=c;
}
void current time(int a;int b;int c)
{ 
  h=a;
 m=b;
 s=c;
}
void advance time(int a;int b;int c;)
{ 
  s=s+c;
  m=m+b+(s/60);
  s=s%60;
  h=h+a+(m/60);
  m=m%60;
  h=h%24;
}
void print()
{ 
 System.out.println("hour="+h);
 System.out.println("minute="+m);
 System.out.println("second="+s);
}
class TIME demo
{ 
  public static void main(string  args[])
{
 scanner sc=new scanner(system.in);
 int ch;
 while(true)
{
  System.out.println("enter your choice");
 int ch=sc.next Int();
 switch (ch)
{ 
 case 1:TIME a=new TIME();
        System.out.println("enter hour,minute,second");
        int hh=sc.next Int();
        int mm=sc.next Int();
        int ss=sc.next Int();
        a.current time(hh,mm,ss);
        a.print();
          break;
case 2:TIME ob=new TIME(hh,mm,ss)
       System.out.println("enter hour,minute,second");
       int hh=sc.next Int();   
       int mm=sc.next Int();
       int ss=sc.next Int();
       ob.advance time(hh,mm,ss);
       ob.print ();
         break;
default:break;
}
}
}
}      
