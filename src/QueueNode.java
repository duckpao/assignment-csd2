class QueueNode<T> {
    T data;
    QueueNode<T> next;

    public QueueNode(T data) {
        this.data = data;
        this.next = null;
    }
}

class Queue<T> {
    private QueueNode<T> front, rear;

    public void enqueue(T data) {
        QueueNode<T> newNode = new QueueNode<>(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return null;
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public void display() {
        QueueNode<T> current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        
        }
    }
    
}
