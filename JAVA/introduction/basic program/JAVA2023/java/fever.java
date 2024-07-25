/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class fever
{
	public static void main (String[] args) throws java.lang.Exception
	{
            Scanner t = new Scanner(System.in);
            int y = t.nextInt();
            while(y-->0){
                int x = t.nextInt();
                int b=98;
                if(x<=b){
                    System.out.println("no");
                }
                else if(x>b){
                    System.out.println("yes");
                }
                else{
                    System.out.println("end the match:");
                }
            }
        }
    }
