public class RoundRobinScheduler {

    class Node {
        int processId;
        int burstTime;
        int priority;
        int remainingTime;
        int waitingTime;
        int turnaroundTime;
        Node next;

        public Node(int processId, int burstTime, int priority) {
            this.processId = processId;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
            this.priority = priority;
            this.waitingTime = 0;
            this.turnaroundTime = 0;
            this.next = this;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int totalProcesses = 0;

    public void addProcess(int processId, int burstTime, int priority) {
        Node newNode = new Node(processId, burstTime, priority);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        totalProcesses++;
    }

    public void removeProcess(int processId) {
        if (head == null) {
            return;
        }
        Node temp = head;
        Node prev = tail;
        do {
            if (temp.processId == processId) {
                if (temp == head && temp == tail) {
                    head = tail = null;
                } else if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                totalProcesses--;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int time = 0;
        Node temp = head;

        while (totalProcesses > 0) {
            if (temp.remainingTime > 0) {
                int timeSpent = Math.min(temp.remainingTime, timeQuantum);
                temp.remainingTime -= timeSpent;
                time += timeSpent;

                Node walker = head;
                do {
                    if (walker != temp && walker.remainingTime > 0) {
                        walker.waitingTime += timeSpent;
                    }
                    walker = walker.next;
                } while (walker != head);

                if (temp.remainingTime == 0) {
                    temp.turnaroundTime = time;
                    System.out.println("Process " + temp.processId + " completed. Turnaround time: " + temp.turnaroundTime + ", Waiting time: " + temp.waitingTime);
                    removeProcess(temp.processId);
                    if (head == null) break;
                    temp = temp.next;
                } else {
                    temp = temp.next;
                }

                displayProcesses();
            } else {
                temp = temp.next;
            }
        }

        calculateAverageTimes();
    }

    public void displayProcesses() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = head;
        System.out.println("Current Processes:");
        do {
            System.out.println("Process ID: " + temp.processId +
                    ", Burst Time: " + temp.burstTime +
                    ", Remaining Time: " + temp.remainingTime +
                    ", Priority: " + temp.priority +
                    ", Waiting Time: " + temp.waitingTime);
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public void calculateAverageTimes() {
        int totalWT = 0;
        int totalTAT = 0;
        int count = 0;

        Node temp = head;
        if (temp == null) {
            System.out.println("All processes completed.");
            return;
        }

        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            count++;
            temp = temp.next;
        } while (temp != head);

        double avgWT = (double) totalWT / count;
        double avgTAT = (double) totalTAT / count;

        System.out.println("Average Waiting Time: " + avgWT);
        System.out.println("Average Turnaround Time: " + avgTAT);
    }

    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);

        scheduler.displayProcesses();

        scheduler.simulate(3);
    }
}
