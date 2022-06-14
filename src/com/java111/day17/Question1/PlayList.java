package com.java111.day17.Question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PlayList {
    public List<Song> songs = new ArrayList<>();
    HashSet<Song> songHashSet = new HashSet<>();

    public void addSong(Song song) {
        boolean bool = songHashSet.add(song);
//        System.out.println(bool);
        if (bool) {
            System.out.println("Song added to the playlist successfully");
        } else {
            System.out.println("Song is already added in the playlist");
        }
    }
}
