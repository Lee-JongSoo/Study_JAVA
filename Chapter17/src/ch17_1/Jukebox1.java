package ch17_1;

import java.util.*;
import java.io.*;

public class Jukebox1 {
    ArrayList<String> songList = new ArrayList<>();

    public static void main(String[] args){
        new Jukebox1().go();
        System.out.println("by 2017250035 이종수");
    }

    public void go(){
        getSongs();
        System.out.println(songList);
    }

    void getSongs(){
        try {
            File file = new File("/Users/leejongsu/IdeaProjects/Chapter17/src/ch17_1/SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine()) != null){
                addSong(line);
            }
        }catch (Exception ex){ex.printStackTrace();}
    }

    void addSong(String linetoParse){
        String[] tokens = linetoParse.split("/");
        songList.add(tokens[0]);
    }
}
