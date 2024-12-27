import java.util.Scanner;

public class HalloweenFilmPlaylist {
    public static void main(String[] args) {
        CircularLinkedList<Object> circularHalloweenFilmPlaylist = new CircularLinkedList<>();
        CircularLinkedList<String> circularListFilmName = new CircularLinkedList<>();
        CircularLinkedList<Integer> circularListFilmRuntime = new CircularLinkedList<>();
        CircularLinkedList<String> circularListFilmDescription = new CircularLinkedList<>();

        //Movie Title
        circularListFilmName.add("Halloween");
        circularListFilmName.add("Friday The 13th");
        circularListFilmName.add("The Thing");
        circularListFilmName.add("Hellraiser");

        //Movie Runtime in minutes
        circularListFilmRuntime.add(91);
        circularListFilmRuntime.add(95);
        circularListFilmRuntime.add(109);
        circularListFilmRuntime.add(94);

        //Movie Description
        circularListFilmDescription.add("Michael Myers, a man who " +
                "murdered his sister as a child, escapes from a sanitarium and returns to " +
                "his hometown to kill again on Halloween.");
        circularListFilmDescription.add("A group of teenage counselors who are stalked and " +
                "murdered by an unknown killer while trying to reopen Camp Crystal Lake.");
        circularListFilmDescription.add("A group of researchers in Antarctica who encounter an " +
                "alien that can take the form of its victims.");
        circularListFilmDescription.add("A mystical puzzle box that summons the Cenobites, " +
                "a group of sadistic beings from another dimension.");

        //Entire Playlist
        //The following shows that you can access the Playlists subcomponents by traversing both forward and backwards
        // or making multiple full rotations around the list
        circularHalloweenFilmPlaylist.add(circularListFilmName.get(0) + "\nRuntime: " + circularListFilmRuntime.get(-4) + " minutes \nDescription: " + circularListFilmDescription.get(-4));
        circularHalloweenFilmPlaylist.add(circularListFilmName.get(1) + "\nRuntime: " + circularListFilmRuntime.get(-3) + " minutes \nDescription: " + circularListFilmDescription.get(1));
        circularHalloweenFilmPlaylist.add(circularListFilmName.get(2) + "\nRuntime: " + circularListFilmRuntime.get(-6) + " minutes \nDescription: " + circularListFilmDescription.get(10));
        circularHalloweenFilmPlaylist.add(circularListFilmName.get(3) + "\nRuntime: " + circularListFilmRuntime.get(-5) + " minutes \nDescription: " + circularListFilmDescription.get(-13));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Spooky Halloween Movie Playlist \n|'n' for next |'p' for previous |'r' for random |'q' to quit|");
        String choice = scanner.nextLine().toLowerCase();
        int adjustor = 0;
        while(!choice.equals("q")) {
            System.out.println(circularHalloweenFilmPlaylist.get(adjustor));
            //if next, previous, or random is chosen
            choice = scanner.nextLine().toLowerCase();
            if (choice.equals("n")) {
                //System.out.println(iteratorHalloweenPlaylist.next());
                adjustor += 1;
            } else if (choice.equals("p")) {
                //System.out.println(iteratorHalloweenPlaylist.previous());
                adjustor -= 1;
            } else if (choice.equals("r")) {
                int rng = ((int) (Math.random() * 100));
                adjustor = rng;
                //System.out.println(circularHalloweenMoviePlaylist.get(rng));
            }
        }
    }
}
