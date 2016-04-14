/*
 * A2L - ArrayList Play - The program executes the creation of several ArrayLists
 * displays their contents and then does computation on the inputs. This program
 * also implements a Name interface.
 */
package linearList;

import java.util.ArrayList;

/**
 *
 * @author NicholasFerrara
 */
public class ArrayListPlay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> songs = createSongList();
        display("The songs...", songs);
        ArrayList<Name> actors = createActorList();
        display("The actors...", actors);
        ArrayList<SCircle> circles = createCircleList();
        display("The circles...", circles);
        displayTitles(songs);
        displayInitials(actors);
        displayAreas(circles);
        System.out.println("");

    }

    private static ArrayList<String> createSongList() {
        ArrayList<String> songs = new ArrayList<String>();
        songs.add("Dreamhouse");
        songs.add("Irresistible");
        songs.add("Sunbather");
        songs.add("Please Remember");
        songs.add("Vertigo");
        songs.add("Windows");
        songs.add("The Pecan Tree");
        songs.add("Brought To The Water");
        return songs;
    }

    private static void display(String z, ArrayList x) {
        System.out.println("\n" + z);
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
    }

    private static ArrayList<Name> createActorList() {
        ArrayList actors = new ArrayList<Name>();

        Name n0 = new Name("Aaron", "Eckhart");
        Name n1 = new Name("Aaron", "Paul");
        Name n2 = new Name("Adam", "Sandler");
        Name n3 = new Name("Adrien", "Brody");
        Name n4 = new Name("Al", "Pacino");
        Name n5 = new Name("Alec", "Baldwin");
        Name n6 = new Name("Andrew", "Garfield");

        actors.add(n0.toString());
        actors.add(n1.toString());
        actors.add(n2.toString());
        actors.add(n3.toString());
        actors.add(n4.toString());
        actors.add(n5.toString());
        actors.add(n6.toString());

        return actors;

    }

    private static ArrayList<SCircle> createCircleList() {
        ArrayList<SCircle> circles = new ArrayList<SCircle>();

        SCircle c0 = new SCircle(3.22);
        SCircle c1 = new SCircle(100.21);
        SCircle c2 = new SCircle(78.46);
        SCircle c3 = new SCircle(574.20);
        SCircle c4 = new SCircle(54.78);
        SCircle c5 = new SCircle(74.04);

        circles.add(c0);
        circles.add(c1);
        circles.add(c2);
        circles.add(c3);
        circles.add(c4);
        circles.add(c5);

        return circles;

    }

    private static void displayTitles(ArrayList<String> songs) {
        System.out.println("\nSong title lengths...");
        for (int i = 0; i < songs.size(); i++) {
            String s = songs.get(i);
            System.out.println(s.length());

        }

    }

    private static void displayInitials(ArrayList<Name> actors) {
        System.out.println("\nThe initials...");
        ArrayList actorsTwo = new ArrayList<Name>();

        Name a0 = new Name("Aaron", "Eckhart");
        Name a1 = new Name("Aaron", "Paul");
        Name a2 = new Name("Adam", "Sandler");
        Name a3 = new Name("Adrien", "Brody");
        Name a4 = new Name("Al", "Pacino");
        Name a5 = new Name("Alec", "Baldwin");
        Name a6 = new Name("Andrew", "Garfield");

        actorsTwo.add(a0.initials());
        actorsTwo.add(a1.initials());
        actorsTwo.add(a2.initials());
        actorsTwo.add(a3.initials());
        actorsTwo.add(a4.initials());
        actorsTwo.add(a5.initials());
        actorsTwo.add(a6.initials());

        for (int i = 0; i < actorsTwo.size(); i++) {
            System.out.println(actorsTwo.get(i));

        }
    }

    private static void displayAreas(ArrayList<SCircle> circles) {
        System.out.println("\nThe areas...");
        ArrayList circlesTwo = new ArrayList<SCircle>();

        SCircle b0 = new SCircle(3.22);
        SCircle b1 = new SCircle(100.21);
        SCircle b2 = new SCircle(78.46);
        SCircle b3 = new SCircle(574.20);
        SCircle b4 = new SCircle(54.78);
        SCircle b5 = new SCircle(74.04);

        circlesTwo.add(b0.getArea(3.22));
        circlesTwo.add(b1.getArea(100.21));
        circlesTwo.add(b2.getArea(78.46));
        circlesTwo.add(b3.getArea(574.20));
        circlesTwo.add(b4.getArea(54.78));
        circlesTwo.add(b5.getArea(74.04));

        for (int i = 0; i < circlesTwo.size(); i++) {
            System.out.println(circlesTwo.get(i));

        }

    }

}
