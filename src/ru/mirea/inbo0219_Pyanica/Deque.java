package ru.mirea.inbo0219_Pyanica;


import java.util.ArrayDeque;

public class Deque {
    public Deque(int p1[], int p2[]){
        ArrayDeque<Integer> player1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> player2 = new ArrayDeque<Integer>();

        for (int i = 0; i < 5; i++){
            player1.addLast(p1[i]);
            player2.addLast(p2[i]);
        }
        int count = 0;

        while (player1.size() != 0 && player2.size() != 0 && count < 106){
            if (player1.getFirst() > player2.getFirst()){
                if (player1.getFirst() == 9 && player2.getFirst() == 0){
                    player1.addLast(player1.getFirst());
                    player1.addLast(player2.getFirst());
                    player1.pop();
                    player2.pop();
                }
                else {
                    player2.addLast(player1.getFirst());
                    player2.addLast(player2.getFirst());
                    player1.pop();
                    player2.pop();
                }
            }
            else if (player2.getFirst() > player1.getFirst()){
                if (player2.getFirst() == 9 && player1.getFirst() == 0){
                    player2.addLast(player1.getFirst());
                    player2.addLast(player2.getFirst());
                    player1.pop();
                    player2.pop();
                }
                else {
                    player1.addLast(player1.getFirst());
                    player1.addLast(player2.getFirst());
                    player1.pop();
                    player2.pop();
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
