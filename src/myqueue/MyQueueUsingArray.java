/*
 * Created by Intellij IDEA
 * User: Tavishi123-singh
 */
package myqueue;

public class MyQueueUsingArray {
    private int[] queue;
    private int rear;
    private int front;
    private int size;

    public MyQueueUsingArray(int sizeOfArray) {
        queue=new int[sizeOfArray];
        rear=-1;
        front=-1;
        size=0;
    }
    public boolean isEmpty(){
        boolean res=false;
        if(front==rear) res=true;
        return res;
    }
    public boolean enqueue(int element){
        boolean res=false;
        if(rear!=queue.length-1){
            rear++;
            queue[rear]=element;
            res=true;
            size++;
        }
        return res;
    }
    public int dequeue(){
        int res=0;
        if(!isEmpty()){
            front++;
            res=queue[front];
            size--;
        }
        return res;
    }
    public int peek(){
        int res=0;
        if(!isEmpty()){
            res=queue[front+1];
        }
        return res;
    }

    public int getSize() {
        return size;
    }
}
