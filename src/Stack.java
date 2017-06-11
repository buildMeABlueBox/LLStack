/**
 * Created by abhijit_kamat on 6/9/17.
 */
class Stack {
    private Node head;

    void push(int num){
        Node insert;
        insert = new Node(num, head);
        head = insert;
        System.out.println("pushed " + num);
        printCurrentValues();
    }
    void pop(){
        System.out.println("Trying to pop... ");
        if(head != null) {
            System.out.println("popping " + head.data);
            Node delete = head;
            head = head.next;
            delete.next = null;
        } else {
            System.out.println("Stack is empty.");
        }
        printCurrentValues();
    }

    private void printCurrentValues(){
        System.out.print("Current Stack: ");

        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("\n");
    }
}
