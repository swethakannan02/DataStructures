/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include<string.h>
int main()
{
   char str1[15],str2[20];
   scanf("%s",str1);
   scanf("%s",str2);
   int res,res1,res2;
   res=strncmp(str1,str2,1);
   res1=strncmp(str1,str2,2);
   res2=strncmp(str1,str2,3);
   printf("%d",res);
   printf("%d",res1);
   printf("%d",res2);
}
