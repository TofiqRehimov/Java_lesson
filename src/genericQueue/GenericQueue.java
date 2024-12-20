package genericQueue;

import java.util.LinkedList;

public class GenericQueue<T> {
    private LinkedList<T> element = new LinkedList<>();

    public void addEnqueue(T e) {
        element.addLast(e);
    }

  public void Dequeue(){
      System.out.println(element.poll());
  }

  public void isEmpty(){
        if(!element.isEmpty()){
            System.out.println("Doludur");
        }
        else System.out.println("Bosdur");
  }
    public void printQueue() {
        for (T item : element) {
            System.out.print(item + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        GenericQueue<Integer> qeue = new GenericQueue<>();
        qeue.addEnqueue(1);
        qeue.addEnqueue(2);
        qeue.printQueue();
        qeue.Dequeue();
        qeue.isEmpty();
        GenericQueue<String> sQueue = new GenericQueue<>();
        sQueue.addEnqueue("Tofiq");
        sQueue.Dequeue();
        sQueue.isEmpty();

    }

    }


