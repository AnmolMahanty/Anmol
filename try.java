import java.io.*;
class Try
{
public static void main(String args[]) throws IOException
{
int a,b,res;
BufferedReader br =new BufferedReader (new InputStreamReader(System.in));

try
{
String str;
System.out.println("\nEnter Dividend");
str =br.readLine();
a=Integer.parseInt(str);
System.out.println("\nEnter Divisor");
str =br.readLine();
b=Integer.parseInt(str);
res=a/b;
System.out.println("\n TheQuotient"+res);
}
catch(ArithmeticException ae)
{
System.out.println("\nException ERROR Entered divisor as zero");
}
catch(NumberFormatException e){
// show if value is invalid.
System.out.println("Invalid Input...");
}

}

}