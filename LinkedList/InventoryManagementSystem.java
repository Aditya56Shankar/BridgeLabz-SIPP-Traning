public class InventoryManagementSystem {
    Node head;
    class Node {
        String itemName;
        int itemId;
        int quantity;
        int price;
        Node next;


        public Node(String itemName, int itemId, int quantity, int price) {
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    public void addfirst(String itemName, int itemID, int Quantity,int Price) {
        Node newNode = new Node(itemName,itemID,Quantity,Price);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void addLast(String itemName, int itemID, int quantity,int price){
        Node newNode = new Node(itemName,itemID,quantity,price);

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
    public void addIndex(String itemName, int itemID, int quantity,int price,int index){
        Node newNode = new Node(itemName,itemID,quantity,price);


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
    public void delete(int itemId){

        Node temp=head;
        while (temp.next!=null){
            if(temp.itemId==itemId){
                break;
            }

            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public void update(int id,int quantity){
        Node temp=head;
        while (temp.next!=null){
            if(temp.itemId==id){
                temp.quantity=quantity;
                return;
            }
            temp=temp.next;
        }
    }
    public void search(int itemId) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                System.out.println("found");
                System.out.println("Item Name: " + temp.itemName);
                System.out.println("Item ID: " + temp.itemId);
                System.out.println("Quantity: " + temp.quantity);
                System.out.println("Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    public void search(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemName.equals(name)) {
                System.out.println("found");
                System.out.println("Item Name: " + temp.itemName);
                System.out.println("Item ID: " + temp.itemId);
                System.out.println("Quantity: " + temp.quantity);
                System.out.println("Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }
    public void calculateTotal() {
        Node temp = head;
        int totalValue = 0;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("total: "+totalValue);
    }
    public void sort() {
        head = mergeSort(head);
    }
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        Node rightHead = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        return mergeTwoLists(left, right);
    }

    private Node mergeTwoLists(Node l1, Node l2) {
        Node newNode = new Node("", -1, 0, 0);
        Node temp = newNode;

        while (l1 != null && l2 != null) {
            if (l1.price < l2.price) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        while (l1!=null){
            temp.next=l1;
            l1=l1.next;
        }

        while (l2!=null){
            temp.next=l2;
            l2=l2.next;
        }
        return newNode.next;
    }


}
