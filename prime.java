import java.util.*; 
class prime 
{ 
 public static void main(String args[]) 
 { 
 int n,i=2; 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter number:"); 
 n=sc.nextInt(); 
 while(n%i!=0) 
 { 
 i++; 
 } 
 
 if(n==i) 
 { 
 System.out.println("prime number"); 
 } 
 else 
 { 
 System.out.println("not a prime number"); 
 } 
 } 
} 