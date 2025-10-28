package lab2_19_08_25;

import java.util.LinkedList;
import java.util.Scanner;

class PlaylistManager {
    private LinkedList<String> playlist = new LinkedList<>();
    private Scanner sc = new Scanner(System.in);


    public void addSong() {
        System.out.println("Enter song name to add:");
        String song = sc.nextLine();
        System.out.println("Where do you want to add the song?");
        System.out.println("1. At the beginning");
        System.out.println("2. At the end");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        if (choice == 1) {
            playlist.addFirst(song);
        } else if (choice == 2) {
            playlist.addLast(song);
        } else {
            System.out.println("Invalid choice.");
        }
        displayPlaylist();
    }


    public void removeSong() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty!");
            return;
        }

        System.out.println("Remove from:");
        System.out.println("1. Beginning");
        System.out.println("2. End");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        if (choice == 1) {
            System.out.println("Removed: " + playlist.removeFirst());
        } else if (choice == 2) {
            System.out.println("Removed: " + playlist.removeLast());
        } else {
            System.out.println("Invalid choice.");
        }
        displayPlaylist();
    }


    public void replaceSong() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty!");
            return;
        }

        System.out.println("Enter index to replace (starting from 0):");
        int index = sc.nextInt();
        sc.nextLine(); // clear buffer

        if (index < 0 || index >= playlist.size()) {
            System.out.println("Invalid index!");
            return;
        }

        System.out.println("Enter new song name:");
        String newSong = sc.nextLine();

        playlist.set(index, newSong);
        displayPlaylist();
    }


    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty!");
        } else {
            System.out.println("\n🎵 Current Playlist:");
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println((i) + ". " + playlist.get(i));
            }
            System.out.println();
        }
    }
}

public class MusicPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlaylistManager manager = new PlaylistManager();

        while (true) {
            System.out.println("----- MUSIC PLAYLIST MENU -----");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Replace Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                manager.addSong();
            } else if (choice == 2) {
                manager.removeSong();
            } else if (choice == 3) {
                manager.replaceSong();
            } else if (choice == 4) {
                manager.displayPlaylist();
            } else if (choice == 5) {
                System.out.println("Exiting Playlist Manager...");
                break;
            } else {
                System.out.println("Invalid choice. Try again!");
            }
        }
        sc.close();
    }
}

