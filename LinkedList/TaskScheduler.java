import java.time.LocalDate;
public class TaskScheduler {

    class Node {
        int taskId;
        String taskName;
        int priority;

        LocalDate dueDate;
        Node next;

        public Node(int taskId, String taskName, int priority, LocalDate dueDate) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
            this.next = this;
        }
    }
    private Node head = null;
    private Node tail = null;
    public void addFirst(int taskId, String taskName, int priority, LocalDate dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }
    public void addLast(int taskId, String taskName, int priority, LocalDate dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    public void addAtIndex(int taskId, String taskName, int priority, LocalDate dueDate, int index) {
        if (index <= 0 || head == null) {
            addFirst(taskId, taskName, priority, dueDate);
            return;
        }

        Node temp = head;
        int i = 0;
        while (temp.next != head && i < index - 1) {
            temp = temp.next;
            i++;
        }


            Node newNode = new Node(taskId, taskName, priority, dueDate);
            newNode.next = temp.next;
            temp.next = newNode;

    }

    public void remove(int id){
        if (head == null) {
            System.out.println("Task list is empty.");
            head = tail = null;
            return;
        }
        Node temp=head;
        Node prev=tail;
        do{
            if(temp.taskId==id){
                if (head==tail){
                    return;
                }
                else if(temp==head){
                    head=head.next;
                    tail.next=head;
                }
                else if(temp==tail){
                    tail=prev;
                    tail.next=head;
                }
                else{
                    prev.next=temp.next;

                }
                return;
            }
            prev=temp;
            temp=temp.next;
        }
        while (temp != head);
    }
    public void search(int priority){
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        boolean f=false;
        Node temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println("Task ID: " + temp.taskId +
                        ", Name: " + temp.taskName +
                        ", Priority: " + temp.priority +
                        ", Due Date: " + temp.dueDate);
                f=true;
            }
            temp = temp.next;
        }
        while(temp!=head);
        if(f){
            System.out.println("not found");
        }
    }
    public void printTask() {
        Node temp=head;
        do {
            System.out.println("Task ID: " + temp.taskId +
                    ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority +
                    ", Due Date: " + temp.dueDate);
            temp=temp.next;
        }

        while (temp != head);
    }
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addLast(3, "Task A", 2, LocalDate.of(2023, 8, 1));
        scheduler.addFirst(1, "Task B", 1, LocalDate.of(2023, 7, 20));
        scheduler.addAtIndex(2, "Task C", 3, LocalDate.of(2023, 8, 15), 1);

        scheduler.printTask();

        scheduler.search(2);
        scheduler.search(5);

        scheduler.remove(2);
        scheduler.printTask();
    }


}