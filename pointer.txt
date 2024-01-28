/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//modify the next element into previous element
#include <stdio.h>

int main()
{
  int num[]={10,20,30,40,50};
  int *ptr;
  ptr=&num[0];
  printf("Value of address %p: %d\n",ptr,*ptr);//%p->pointer format specifer
  //move the pointer to the next element of the array
  ptr++;
  printf("Value at address %p: %d\n",ptr,*ptr);
  return 0;
}
