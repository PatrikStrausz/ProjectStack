package sk.itsovy.strausz.queue;

import sk.itsovy.strausz.exeption.OverFlowException;
import sk.itsovy.strausz.exeption.UnderFlowException;

import java.util.ArrayList;
import java.util.List;

public class Queue<T>{
    private int size=0;
    private int capacity;
    private List<T> list;

    public Queue(int capacity) {
        if(capacity > 0) {
            this.capacity = capacity;
            list = new ArrayList<>();
            System.out.println("Queue was created with size of " +capacity);
        }else{
            System.out.println("Wrong input. Queue was set to default values.");
            this.capacity = 5;
            list = new ArrayList<>();
        }
    }


    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==capacity;
    }

    public void enqueue(T value) {
        try {
            if (value == null)
                return;
            if (!isFull()) {
                list.add(value);
                size++;
                System.out.println(value + " was added to a queue");
            } else throw new OverFlowException("The queue is full");


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void dequeue(){
        try {
            if (!isEmpty()) {
                System.out.println(list.get(0) +" was deleted. ");
                list.remove(0);
                size--;
            } else throw new UnderFlowException("The stack is empty");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public T front() {
        if (isEmpty()) {
            return null;
        } else {
            System.out.println("Top one is: "+list.get(0));
            return list.get(size - 1);
        }

    }
    public T frontAndDequeue() {
        T temp = front();
        dequeue();
        return temp;

    }
    public void empty() {
        list.clear();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return  list.toString();
    }
}
