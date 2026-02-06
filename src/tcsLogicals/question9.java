package tcsLogicals;
// An intelligence agency has received reports about some threats. The reports consist of numbers in a mysterious method. There is a 
// number “N” and another number “R”. Those numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are 
// summed up and this action is performed ‘R’ number of times. The resultant is also a single digit that is yet to be deciphered. 
// The task here is to find the single-digit sum of the given number ‘N’ by repeating the action ‘R’ number of times.
// If the value of ‘R’ is 0, print the output as ‘0’.
// Example 1:
// Input :
// 99 -> Value of N
// 3  -> Value of R
// Output :
// 9  -> Possible ways to fill the cistern.


import java.util.*;
class question9
{
    public static int sumOfDigits(int n)
       {
             int sum=0;
             while(n != 0)
             {
                  sum+=n%10;
                  n=n/10;
             }
           return sum;
        }
    public static void main(String []args)
        {
              Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              int r=sc.nextInt();
              if(r==0)
                    System.out.println("0");
              else
              {
                       int res=sumOfDigits(n)*r;
                       int sum=0;
                       while(true)
                       {
                               while(res>0)
                             {
                                    sum=sum+res%10;
                                    res=res/10;
                              }
                              if((sum/10)==0)
                                 break;
                              else
                                 res=sum;
                      }
                      System.out.println(sum);
                }  
        }
    }