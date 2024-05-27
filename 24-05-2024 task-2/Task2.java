// 1. WAP to Swap Two Numbers in java. 
public class Task2 { 
  
    public static void main(String args[]) 
    { 
        int x = 10; 
        System.out.println("value of x:"+ x);
        int y = 5; 
        System.out.println("value of y:"+ y);
        x = x + y; 
        y = x - y; 
        x = x - y; 
        System.out.println("After swapping:"+ " x = " + x + ", y = " + y); 
 


// 2. WAP to convert Integer numbers and Binary numbers in java. 

        int number = 15;
        String binary = Integer.toBinaryString(number);
        System.out.println("number is : " + number);
        System.out.println("converted into binary number : " +binary);




// 3. WAP to Find Factorial of a Number in Java. 

       int num = 5;
       long factorial = 1;
       for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.println("number is : " + num);
        System.out.printf("Factorial of %d = %d", num, factorial);
        System.out.println(" " );








// 5. WAP to Calculate Simple Interest in Java. 

    //    Simple Interest = (P x T x R)/100 
    // P = principal
    // R = interest rate (in percentage)
    // T = time duration (in years)

    float P = 25000, R = 2, T = 2.5f;
    System.out.println("principal = " + P);
    System.out.println("interest rate = " + R);
    System.out.println("time duration = " + T);
    float SI = (P * T * R) / 100;
    System.out.println("Simple interest = " + SI);

  
  
  
  
    }
}