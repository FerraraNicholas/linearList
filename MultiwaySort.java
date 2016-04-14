/*
 * Program executes reading a file, putting it in to with # of vowels
 * then by length
 */
package linearList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author NicholasFerrara
 */
public class MultiwaySort {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<String> song = scanFileIn();
        display(song);
        song = sort(song);
        song = sortTwo(song);

    }

    private static LinkedList<String> scanFileIn() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Song.txt"));
        LinkedList<String> list = new LinkedList<String>();
        while (sc.hasNext()) {
            String song = sc.next();
            if (!song.equalsIgnoreCase("")) {
                list.add(song);
            }
        }
        return list;
    }

    private static void display(LinkedList<String> song) {
        System.out.println("\n");
        for (String i : song) {
            System.out.println(i);
        }
    }

    private static LinkedList<String> sort(LinkedList<String> song) {
        //establish in memory
        Queue<String> q0 = new LinkedList<String>();
        Queue<String> q1 = new LinkedList<String>();
        Queue<String> q2 = new LinkedList<String>();
        Queue<String> q3 = new LinkedList<String>();
        Queue<String> q4 = new LinkedList<String>();
        //see how many vowels are contained and add
        // to the right queue.
        for (String i : song) {
            if (containsVowel(i) == 1) {
                q1.add(i);
            } else if (containsVowel(i) == 2) {
                q2.add(i);
            } else if (containsVowel(i) == 3) {
                q3.add(i);
            } else if (containsVowel(i) == 4) {
                q4.add(i);
            } else {
                q0.add(i);
            }
        }
        //display, empty and reconstruct the queue
        display(q0);
        display(q1);
        display(q2);
        display(q3);
        display(q4);
        song.clear();
        song = clearQueue(song, q0);
        song = clearQueue(song, q1);
        song = clearQueue(song, q2);
        song = clearQueue(song, q3);
        song = clearQueue(song, q4);
        
        for (String i : song) {
            System.out.println(i);
        }
        return song;
    }

    private static LinkedList<String> sortTwo(LinkedList<String> song) {
        //establish in memory
        Queue<String> q1 = new LinkedList<String>();
        Queue<String> q2 = new LinkedList<String>();
        Queue<String> q3 = new LinkedList<String>();
        Queue<String> q4 = new LinkedList<String>();
        Queue<String> q5 = new LinkedList<String>();
        Queue<String> q6 = new LinkedList<String>();
        Queue<String> q7 = new LinkedList<String>();
        Queue<String> q8 = new LinkedList<String>();
        Queue<String> q9 = new LinkedList<String>();
        Queue<String> q10 = new LinkedList<String>();
        Queue<String> q11 = new LinkedList<String>();
        //check the length and place in right queue
        for (String i : song) {
            int length = i.length();
            if (length == 1) {
                q1.add(i);
            } else if (length == 2) {
                q2.add(i);
            } else if (length == 3) {
                q3.add(i);
            } else if (length == 4) {
                q4.add(i);
            } else if (length == 5) {
                q5.add(i);
            } else if (length == 6) {
                q6.add(i);
            } else if (length == 7) {
                q7.add(i);
            } else if (length == 8) {
                q8.add(i);
            } else if (length == 9) {
                q9.add(i);
            } else if (length == 10) {
                q10.add(i);
            } else if (length == 11) {
                q11.add(i);
            } else {
                System.out.println("");
            }
        }

        song.clear();
        display(q1);
        display(q2);
        display(q3);
        display(q4);
        display(q5);
        display(q6);
        display(q7);
        display(q8);
        display(q9);
        display(q10);
        display(q11);
        song = clearQueue(song, q1);
        song = clearQueue(song, q2);
        song = clearQueue(song, q3);
        song = clearQueue(song, q4);
        song = clearQueue(song, q5);
        song = clearQueue(song, q6);
        song = clearQueue(song, q7);
        song = clearQueue(song, q8);
        song = clearQueue(song, q9);
        song = clearQueue(song, q10);
        song = clearQueue(song, q11);
        for (String i : song) {
            System.out.println(i);
        }

        return song;

    }

    private static int containsVowel(String token) {
        int count = 0;
        for (int i = 0; i < token.length(); i++) {
            if (token.substring(i, i + 1).equalsIgnoreCase("a") || token.substring(i, i + 1).equalsIgnoreCase("e")
                    || token.substring(i, i + 1).equalsIgnoreCase("i") || token.substring(i, i + 1).equalsIgnoreCase("o")
                    || token.substring(i, i + 1).equalsIgnoreCase("u")) {
                count++;
            }
        }
        return count;
    }

    private static void display(Queue<String> queue) {
        int count = 0;
        if (!queue.isEmpty()) {
            System.out.print("Queue:  [ ");
            for (String i : queue) {
                System.out.print(i + " ");
                count++;
                if (count == 10) {
                    System.out.println("");
                    count = 0;
                }
            }
            System.out.println("]");
            System.out.println("");
        }
    }

    private static LinkedList<String> clearQueue(LinkedList<String> song, Queue<String> queue) {
        for (String i : queue) {
            song.add(i);
        }
        return song;
    }

}
