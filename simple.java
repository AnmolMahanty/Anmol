import java.util.* ; 
public class simple
 { 
 public static void main(String[] args) 
{ 
 float p,n,r,si ; 
 Scanner sc = new Scanner(System.in); 
 System.out.println("Enter amount: "); 
p = sc.nextFloat(); 
 System.out.println("No.of years: "); 
n= sc.nextFloat(); 
 System.out.println(" Rate of  interest: "); 
 r = sc.nextFloat(); 
 si = p * n * r/100; 
 System.out.println(" The Simple Interest=" +si); 
 } 
} 