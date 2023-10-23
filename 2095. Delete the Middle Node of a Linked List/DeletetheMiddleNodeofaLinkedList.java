import java.util.List;

class DeletetheMiddleNodeofaLinkedList{
    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null){
            return null;
        }

        ListNode aux = head;
        ListNode aux2 = head;
        int count = 0;
        while(aux != null){
            count++;
            aux = aux.next;
        }
        int medio = count/2;
        int i = 0;
        while(i < medio-1){
            aux2 = aux2.next;
            i++;
        }
        aux2.next = aux2.next.next;
        return head;
    }

    public static void main(String[] args) {
        
    }
}
