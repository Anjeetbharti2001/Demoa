class circularQueue {
    int[] arr;
    int front, rear, size, capacity;

    circularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue is Full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int data = arr[front];
        front = (front + 1) % capacity;
        size--;

        return data;
    }

    int peek() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }

        System.out.println();
    }
}

public class Gen {
    public static void main(String args[]) {

        circularQueue cq = new circularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.display();

        System.out.println("Dequeued: " + cq.dequeue());

        cq.enqueue(60);

        cq.display();

        System.out.println("Front element: " + cq.peek());
    }
}