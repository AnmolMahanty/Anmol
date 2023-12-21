class largest
{ 
 public static void main(String args[]) 
 { 
 int n,a,b,res1; 
 n=Integer.parseInt(args[0]); 
 a=Integer.parseInt(args[1]); 
 b=Integer.parseInt(args[2]); 
 res1=(n>a)?n:a; 
 res1=(res1>b)?res1:b; 
 System.out.println("Largest number is "+res1); 
 } 
} 
