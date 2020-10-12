package ru.mirea.inbo0219_Pyanica;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueP {
    public QueueP(int p1[], int p2[]) {
        Queue<Integer> player1 = new LinkedList<Integer>();
        Queue<Integer> player2 = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++){
            player1.add(p1[i]);
            player2.add(p2[i]);
        }
        int count = 0;

        while (player1.size() != 0 && player2.size() != 0 && count < 106){
            if (player1.element() > player2.element()){
                if (player1.element() == 9 && player2.element() == 0){
                    player1.add(player1.element());
                    player1.add(player2.element());
                    player1.poll();
                    player2.poll();
                }
                else {
                    player2.add(player1.element());
                    player2.add(player2.element());
                    player1.poll();
                    player2.poll();
                }
            }
            else if (player2.element() > player1.element()){
                if (player2.element() == 9 && player1.element() == 0){
                    player2.add(player1.element());
                    player2.add(player2.element());
                    player1.poll();
                    player2.poll();
                }
                else {
                    player1.add(player1.element());
                    player1.add(player2.element());
                    player1.poll();
                    player2.poll();
                }
            }
            count += 1;
        }
        if (player1.size() == 0){
            System.out.print("\nfirst ");
            System.out.print(count);
        }
        else{
            System.out.print("\nsecond ");
            System.out.print(count);
        }
    }
}
