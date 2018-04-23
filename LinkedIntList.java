package Chapter16.exercise17;

public class LinkedIntList
{
    /*
        Write a method called doubleList that doubles the size of a list by appending a copy of the original sequence to
        the end of the list. For example, if a variable list stores the values [1, 3, 2, 7] and we make the call of
        list.doubleList(); then after the call it should store [1, 3, 2, 7, 1, 3, 2, 7]. Notice that the list has
        been doubled in size by having the original sequence appear twice in a row. You may not make assumptions about
        how many elements are in the list. You may not call any methods of the class to solve this problem. If the
        original list contains n nodes, then you should construct exactly n nodes to be added. You may not use any auxiliary
        data structures such as arrays or ArrayLists to solve this problem. Your method should run in O(n) time where n is
        the number of nodes in the list.
    */

    private ListNode front;

    //  Exercise 17 ////////////////////////////////////////////////////////
    public void doubleList()
    {
        if (this.front != null)
        {

            ListNode current = this.front;
            int max = 0;

            while (current != null)
            {
                current = current.next;
                max++;
            }


            current = this.front;
            int count = 0;

            while (count  < max)
            {
                this.add(current.getData());
                current = current.next;
                count++;
            }
        }
    }
    ////////////////////////////////////////////////////////

    public LinkedIntList()
    {
        this.front = null;
    }

    public void add(int value)
    {
        if(this.front == null)
            this.front = new ListNode(value);
        else
        {
            ListNode current = this.front;

            while (current.next != null)
            {
                current = current.next;
            }

            current.next = new ListNode(value);
        }
    }

    @Override
    public String toString()
    {
        if (this.front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.getData();
            ListNode current = this.front.next;

            while (current != null)
            {
                result += ", " + current.getData();
                current = current.next;
            }
            result += "]";
            return result;
        }
    }
}
