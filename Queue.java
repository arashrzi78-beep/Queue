public class Queue {
    private int rear, front;
    private Object[] elements;

    public Queue(int capacity) {
        elements = new Object[capacity];
        rear = -1;
        front = 0;
    }

    public void enqueue(Object data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            rear++;
            elements[rear] = data;
        }
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            Object retDate = elements[front];
            elements[front] = null;
            front = front + 1;
            return retDate;
        }
    }

    public Object peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            return elements[front];
        }
    }

    public boolean isEmpty() {
        return rear < front;
    }

    boolean isFull() {
        return rear + 1 == elements.length;
    }
    public int size() {
        return rear - front + 1;
    }
}
