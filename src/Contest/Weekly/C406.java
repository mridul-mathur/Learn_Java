package Contest.Weekly;

import java.util.HashSet;
import java.util.Set;

public class C406 {

    public static void main(String[] args) {
        String s = "45320";
        System.out.println(getSmallestString(s));
        int[] nums = {1, 2, 3};

        int[] heads = {2, 3, 4, 5};
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        modifiedList(nums, head);
        int m = 3, n = 2;
        int[] horizontalCut = {1,3};
        int[] verticalCut = {5};
        System.out.println(minimumCost(m, n, horizontalCut, verticalCut));
    }

    private static int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        int hcost = 0;
        int vcost = 0;
        for (int i :horizontalCut) {
            hcost+=i*(n-1);

        }
        for (int i :verticalCut) {
            vcost+=i*(m-1);
        }
        int cost =0;

        return cost;
    }



    public static String getSmallestString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (((int) s.charAt(i) % 2) == ((int) s.charAt(i + 1) % 2) && s.charAt(i) > s.charAt(i + 1)) {
                s = swap(s, i);
                return s;
            }
        }
        return s;
    }

    private static String swap(String s, int i) {
        char[] carray = s.toCharArray();
        char temp = carray[i];
        carray[i] = carray[i + 1];
        carray[i + 1] = temp;
        return new String(carray);
    }

    private static ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> deltethis = new HashSet<>();
        for (int num : nums) {
            deltethis.add(num);
        }
        ListNode zeroindx = new ListNode(0);
        zeroindx.next = head;
        ListNode curr = head;
        ListNode prev = zeroindx;
        while (curr != null) {
            if (deltethis.contains(curr.val)) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return zeroindx.next;
    }


    private static class ListNode {
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

        public static void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
