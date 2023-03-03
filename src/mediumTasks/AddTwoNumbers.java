package mediumTasks;


public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        int local = 0;
        answer.val = l1.val + l2.val + local;
        while(l1.next != null || l2.next !=null){
            answer.val = l1.val + l2.val;
        }
        return answer;
    }
}
