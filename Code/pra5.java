import java.util.*;
class Practical5{
	public static void main(String args[])
	 {
	   int[] number={1,2,3,4,5};
	   Practical5 p5=new Practical5();
	   System.out.println(p5.factorial1(4));
	   System.out.println(p5.factorial2(5));
	   System.out.println(p5.factorial3(6));
	   System.out.println(p5.getSum(number));
	 }
	// Factorial(using for loop)
	 int factorial1(int number)
	   {
		if(number>=0)
		 {
		    if(number<2)
		     {
		       return 1;
		     }
		    else
		     {
		        int fact=2;
		        for( ;number>2;)
		          {
		             fact*=number--;
		          }
		         return fact;
		     } 
		 } 
		 else
		   {
		     return -1;
		   }
	    }		
	 // Factorial(using while loop) 
	 int factorial2(int number)
	    {
		if(number>=0)
		  {
		       if(number<2)
		        {
		           return 1;
		        }
		        else
		        {
		            int fact=2;
		            while(number>2)
		              {
		                fact*=number--;
		              }
		            return fact;
		         } 
		    } 
		   else
		     {
		       return -1;
		     }
	      }
	 // Factorial(without using looping statement) 
	 int factorial3(int number)
	   {
	      if(number>=0)
		{
		   if(number<2)
		     {
		        return 1;
		     }
		    else
		     {
		       return number*factorial3(number-1);
		     }
		}
		else
		 {
		    return -1;
		 }
	   }
	//sum of array elements
	int getSum(int[] number)
	  {
	     if(number.length==0)
	       {
		  return 0;
	       }
	       else
	       {
		 int[] a=Arrays.copyOfRange(number,1,number.length);
		 return number[0]+getSum(a);
	       }
	    }       
 }
