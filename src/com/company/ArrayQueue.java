package com.company;

public class ArrayQueue {
    private int size;
    private char[] Q;
    private int head,tail;
    ArrayQueue(int arraySize){
        this.size = arraySize;
        head = tail = 0;
        Q = new char[size];
    }

    public void EnQueue(char ch){       //by EnQueue ,tail will move through the array
        if(!isFull())        //if our queue is not full
        {
            Q[tail] = ch;
            tail = (tail+1) % size;
        }
    }

    public char DeQueue(){              //by DeQueue , head will move through the array
        if(!isEmpty()){                  //if our chain is no Empty
            char ch  = Q[head];
            head = (head+1)%size;
            return ch;
        }else {                         //if our chain is Empty
            return '0';
        }
    }

    public boolean isEmpty(){
        if(head == tail){
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull() {
        if(tail == size-1){
            return true;
        }else {
            return false;
        }
    }
}
