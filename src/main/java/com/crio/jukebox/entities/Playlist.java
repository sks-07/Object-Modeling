package com.crio.jukebox.entities;

import java.util.List;

public class Playlist{
    private User user;
    private String pname;
    List<Song> song_id;

    Playlist(String ID,String play_name,List<Song> ids){
        this.user.id=ID;
        this.pname=play_name;
        this.song_id=ids;
    }

    public String getPname(){
        return pname;
    }

    public List<Song> getSongIDs(){
        return song_id;
    }

    public void cretaPlaylist(){

    }
}