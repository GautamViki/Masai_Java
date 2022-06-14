package com.java111.day17.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Song[] songs = new Song[4];
        PlayList playList = new PlayList();
        for (int i = 0; i < songs.length; i++) {
            System.out.print("Movie name : ");
            String mName = sc.next();
            System.out.print("Song Name : ");
            String sName = sc.next();
            songs[i] = new Song(mName, sName);

            playList.addSong(songs[i]);
        }
        playList.songs.addAll(playList.songHashSet);
//        playList.displaySong();

        for (Song s : playList.songs) {
            s.play();
        }
    }
}
