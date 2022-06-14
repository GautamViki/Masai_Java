package com.java111.day17.Question1;

import java.util.Objects;

public class Song {
    private String movieName;
    private String songName;

    public Song(String mName, String sName) {
        this.movieName = mName;
        this.songName = sName;
    }

    public Song() {

    }

    public String getMovieName() {
        return movieName;
    }

    public String getSongName() {
        return songName;
    }

    public void play() {
        System.out.println(this.getSongName() + " of " + this.getMovieName() + " is playing...!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return getMovieName().equals(song.getMovieName()) && getSongName().equals(song.getSongName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovieName(), getSongName());
    }

}
