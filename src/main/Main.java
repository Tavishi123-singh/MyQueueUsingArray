/*
 * Created by Intellij IDEA
 * User: Tavishi123-singh
 */
package main;

import myqueue.MyQueueUsingArray;

public class Main {
    public static void main(String[] args) {
        MyQueueUsingArray queue=new MyQueueUsingArray(10);
        queue.enqueue(1000);
        System.out.println(queue.getSize());
        System.out.println(queue.peek() + " element at front");
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(200);
        System.out.println(queue.dequeue() + " element deleted from queue");
        System.out.println("The size queue is: " + queue.getSize());
        System.out.println(queue.peek());

    }
}
