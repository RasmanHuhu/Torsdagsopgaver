class Fibonacci {  

 static int n1=0,n2=1,n3=0;  

 static void printFibonacci(){    
    if(n3 < 1000 && n1+n2 < 1000){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci();    
     }    
 }    
 public static void main(String args[]){    
  System.out.print(n1+" "+n2);
  printFibonacci();
 }  
}  