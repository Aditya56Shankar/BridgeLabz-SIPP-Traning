public class StudentRecordManagement {

    Node head;
    class Node{
        int rollNumber;
        String name;
        int age;
        String grade;
        Node next;


        public Node(int rollNumber, String name, int age, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }


    }
    public void addfirst(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void addLast(int rollNumber, String name, int age, String grade){
        Node newNode = new Node(rollNumber, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;


    }
    public void addIndex(int rollNumber, String name, int age, String grade,int index){
        Node newNode = new Node(rollNumber, name, age, grade);

        if (index == 0 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }


        Node temp=head;
        int i=0;


        while(temp!=null&&i<index-1){
            i++;
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }


    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.println(
                    "Roll No: " + temp.rollNumber +
                            ", Name: " + temp.name +
                            ", Age: " + temp.age +
                            ", Grade: " + temp.grade
            +"-->");
            temp=temp.next;
        }
    }
    public void search(int rollNumber){
        if (rollNumber<=0){
            return;
        }

        Node temp=head;
        while (temp.next!=null){
            if(temp.rollNumber==rollNumber){
                System.out.println("found ");
                System.out.println(
                        "Roll No: " + temp.rollNumber +
                                ", Name: " + temp.name +
                                ", Age: " + temp.age +
                                ", Grade: " + temp.grade);
            }
            else {
                System.out.println("Not found");

            }
            temp=temp.next;
        }
    }
    public void updateGrade(int rollNumber, String newGrade) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found.");
    }
    public void delete(int rollNumber){

        Node temp=head;
        while (temp.next!=null){
            if(temp.rollNumber==rollNumber){
                break;
            }

            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    public static void main(String[] args) {
        StudentRecordManagement srm=new StudentRecordManagement();
        srm.addfirst(1, "Alice", 20, "A");
        srm.addLast(2, "Bob", 21, "B");
        srm.addIndex(3, "catty", 22, "C",1);
        srm.print();
        System.out.println("after delete");
        srm.delete(1);
        srm.print();
        srm.search(1);
        srm.updateGrade(1,"F");
        srm.print();
    }

    
}
