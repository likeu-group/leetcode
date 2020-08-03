package cool.likeu.algorithm;

/**
 * <p>两数相加</p>
 * <p>给出两个 非空 的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。</p>
 * <p>如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。</p>
 * <p>您可以假设除了数字 0 之外，这两个数都不会以 0 开头。</p>
 *
 * <p>示例：</p>
 * <p>输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)</p>
 * <p>输出：7 -> 0 -> 8</p>
 * <p>原因：342 + 465 = 807</p>
 *
 * <a href="https://leetcode-cn.com/problems/add-two-numbers/">https://leetcode-cn.com/problems/add-two-numbers/</a>
 */
public class AddTwoNumbers {
    
    ListNode listNode1;
    
    ListNode listNode2;
    
    AddTwoNumbers() {
        listNode1 = initListNode(new int[] {2, 4, 3}, 0);
        listNode2 = initListNode(new int[] {5, 6, 4}, 0);
    }
    
    ListNode initListNode(int[] data, int index) {
        int i = data.length;
        ListNode listNode = new ListNode(data[index]);
        if (index < i - 1) {
            ++index;
            listNode.next = initListNode(data, index);
        }
        return listNode;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;
        
            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;
        
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
    
        return root.next;
    }
    
    public static void main(String[] args) {
        AddTwoNumbers app = new AddTwoNumbers();
        ListNode result = app.addTwoNumbers(app.listNode1, app.listNode2);
        
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
    
    static class ListNode {
        
        int val;
        
        ListNode next;
        
        ListNode(int x) {
            val = x;
        }
    }
}
