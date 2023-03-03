package easyTasks;

public class RemoveLinkedListElements {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        if(head.val == val){
            return null;
        }

        ListNode cur = head;

        //1 1 val = 2
        while(cur != null){
            if(cur.next == null){
                return cur;
            }
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }

        return head;
    }
}
