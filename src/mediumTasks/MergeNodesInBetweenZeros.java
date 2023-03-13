package mediumTasks;

public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode cur = new ListNode(-1);
        ListNode root = cur;
        int sum = 0;
        while (head != null) {
            if (head.val == 0 && sum != 0) {
                cur.val = sum;
                if (head.next == null) {
                    break;
                }
                cur.next = new ListNode(-1,null);
                cur = cur.next;
                sum = 0;
            }
            sum += head.val;
            head = head.next;
        }
        return root;

//        ListNode cur = new ListNode(-1);
//        ListNode root = cur;
//        int sum = 0;
//        while (head != null) {
//            if (head.val == 0 && sum != 0) {
//                cur.val = sum;
//                if (head.next == null) {
//                    break;
//                }
//                cur = cur.next;
//                sum = 0;
//            }
//            sum += head.val;
//            head = head.next;
//        }
//        return root;
    }

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
}
