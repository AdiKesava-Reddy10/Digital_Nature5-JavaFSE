class Node {

    int taskId;
    Node next;

    Node(int taskId) {

        this.taskId = taskId;
    }
}

public class TaskManagementSystem {

    public static void main(String[] args) {

        Node head = new Node(1);

        head.next = new Node(2);

        head.next.next = new Node(3);

        Node temp = head;

        while(temp != null) {

            System.out.println(
                    temp.taskId);

            temp = temp.next;
        }
    }
}
