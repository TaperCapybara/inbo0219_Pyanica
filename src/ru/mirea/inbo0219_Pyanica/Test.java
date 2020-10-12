package ru.mirea.inbo0219_Pyanica;

public class Test {
    public static void main(String[] args) {
        int p1[] =new int[]{1,3,5,7,9};
        int p2[] =new int[]{2,4,6,8,0};
        Stack st = new Stack (p1, p2);
        QueueP qu = new QueueP(p1, p2);
        Deque deq = new Deque(p1, p2);
        DoubleList dl = new DoubleList(p1, p2);
    }
}
