import java.io.*;
import java.util.*;
class qw1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String g=s;
StringBuffer sb=new StringBuffer();
sb.append(g);
sb.reverse();
String a=sb.toString();
if(s.equals(a))
{
StringBuffer sb1=new StringBuffer();
sb1.append(a);
int l=sb1.length()-1;
sb1.deleteCharAt(l);
String c=sb1.toString();
int n=c.length();
System.out.println("length:"+c+":"+n);
}
else
{
int n=s.length();
System.out.println("length:"+s+":"+n);
}
}
}