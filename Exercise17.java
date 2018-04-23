package Chapter16.exercise17;

/*
Write a method called removeEvens that removes the values in even-numbered indexes from a list, returning a new
list that contains those values in their original order. For example, consider a variable list1 that stores the
values [8, 13, 17, 4, 9, 12, 98, 41, 7, 23, 0, 92] and imagine that the following call is made:
LinkedIntList list2 = list1.removeEvens();
After the call, list1 should store [13, 4, 12, 41, 23, 92] and list2 should store [8, 17, 9, 98, 7, 0].
You may not call any methods of the class other than the constructor to solve this problem. You may not create any
new nodes nor change the values stored in data fields to solve this problem. You must solve it by rearranging the links
of the list.
 */
public class Exercise17 {

    private ListNode front;

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

    public Exercise17()
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
