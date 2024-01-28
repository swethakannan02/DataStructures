/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//QUEUE
public class Queue1 {
    private static final int MAX_SIZE = 100;
    private int[] queueArray = new int[MAX_SIZE];
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    public void enqueue(int value) {
        if (size < MAX_SIZE) 
        {
            rear = (rear + 1) % MAX_SIZE;
            queueArray[rear] = value;
            size++;
            System.out.println("Enqueued: " + value);
        } 
        else {
            System.out.println("Queue overflow, cannot enqueue");
        }
    }
    public int dequeue()
    {
        if (size > 0)
        {
            int dequeuedValue = queueArray[front];
            front = (front + 1) % MAX_SIZE;
            size--;
            System.out.println("Dequeued: " + dequeuedValue);
            return dequeuedValue;
        } 
        else 
        {
            System.out.println("Queue underflow, cannot dequeue");
            return -1;
        }
    }
    public int peek() 
    {
        if (size > 0) 
        {
            int peekedValue = queueArray[front];
            System.out.println("Queue is empty, cannot peek");
        }
        return -1;
    }

    public static void main(String[] args) {
        Queue1 queue = new Queue1();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.dequeue();
    }
}
    
