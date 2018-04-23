package Chapter16.exercise17;

public class main
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(7);

        list.doubleList();
        System.out.println(list);
    }
}
