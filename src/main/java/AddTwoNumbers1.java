/**
 * @Author: 杨斌
 * @Date: 2019/5/18 22:36
 */
public class AddTwoNumbers1 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode returnAnswer = answer;
        int carry = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            int val = l1.val + l2.val;
            int temp = val + carry;
            carry = temp / 10;
            answer.next = new ListNode(temp % 10);
            l1 = l1.next;
            l2 = l2.next;
            answer = answer.next;
        }
        if (carry != 0) {
            answer.next = new ListNode(carry);
        }
        return returnAnswer.next;
    }

    public void test() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode answer = addTwoNumbers(l1, l2);
        System.out.println(answer);
        while (answer.next != null) {
            System.out.println(answer.next);
            answer = answer.next;
        }
    }

    public static void main(String[] args) {
        new AddTwoNumbers1().test();
    }
}
