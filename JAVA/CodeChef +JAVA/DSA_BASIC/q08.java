/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class q08
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner S=new Scanner (System.in);
int T=S.nextInt();
for(int i=0;i<T;i++) {
  int N=S.nextInt();
  int M=S.nextInt();
  if(N%M==0 && (N/M)%2==0) {
      System.out.println("YES");
  }
  else
   System.out.println("NO");
}
}
}