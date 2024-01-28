/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main()
{
    int num;
    scanf("%d",&num);
    //declare pointer
    int *ptr;
    //assign the address of'num' to the pointer
    ptr=&num;
    printf("Value of num: %d\n",num);
    printf("Value of pointer: %d\n",*ptr);
    //modifying the value using pointer
    *ptr=19;
    printf("Modified value: %d\n",num);
    
}
