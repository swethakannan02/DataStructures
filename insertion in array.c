/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<stdio.h>
int main()
{
    int array[10]={1,2,3,4,5};
    int size=5;
    int position;
    int element=10;
    printf("Enter the position: ");
    scanf("%d",&position);
    printf("array before insertion:\n");
    for(int i=0;i<size;i++)
    {
        printf("%d ",array[i]);
    }
    if(position<0 ||position>size)
    {
        printf("Invalid position");
    }
    for(int i=size-1;i>=position;i--)
    {
        array[i+1]=array[i];
        
    }
    array[position]=element;
    size++;
    printf("After the insertion");
    for(int i=0;i<size;i++)
    {
        printf("%d ",array[i]);
    }
    return 0;
}
