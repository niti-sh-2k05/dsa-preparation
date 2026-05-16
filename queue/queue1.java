import java.util.*;

class queue {
    int[] data;
    int capacity;
    int front;
    int rear;
    int size;

    queue(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("false");
            return;
        }

        data[rear] = value;
        rear = (rear + 1) % capacity;
        size++;

        System.out.println("true");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("false");
            return;
        }

        front = (front + 1) % capacity;
        size--;

        System.out.println("true");
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void rearElement() {
        if (isEmpty()) {
            System.out.println("-1");
            return;
        }

        int index = (rear - 1 + capacity) % capacity;
        System.out.println(data[index]);
    }

    public void frontElement() {
        if (isEmpty()) {
            System.out.println("-1");
            return;
        }

        System.out.println(data[front]);
    }
}

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        int cap = inp.nextInt();
        int n = inp.nextInt();

        queue q = new queue(cap);

        for (int i = 0; i < n; i++) {

            String cmd = inp.next();

            switch (cmd) {

                case "enQueue":
                    int val = inp.nextInt();
                    q.enqueue(val);
                    break;

                case "deQueue":
                    q.dequeue();
                    break;

                case "Rear":
                    q.rearElement();
                    break;

                case "Front":
                    q.frontElement();
                    break;

                case "isFull":
                    System.out.println(q.isFull());
                    break;

                case "isEmpty":
                    System.out.println(q.isEmpty());
                    break;
            }
        }
    }
}