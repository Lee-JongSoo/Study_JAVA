package ch11_2;
import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String [] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
        System.out.println("by 2017250035 이종수");
    }

    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage music1 = new ShortMessage();
            music1.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(music1,1);
            track.add(noteOn);
            ShortMessage stop1 = new ShortMessage();
            stop1.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(stop1, 16);
            track.add(noteOff);


            ShortMessage music2 = new ShortMessage();
            music2.setMessage(144, 9, 50, 80);
            MidiEvent noteOn1 = new MidiEvent(music2,1);
            track.add(noteOn1);
            ShortMessage stop2 = new ShortMessage();
            stop2.setMessage(128, 9, 50, 80);
            MidiEvent noteOff1 = new MidiEvent(stop2, 16);
            track.add(noteOff1);

            ShortMessage music3 = new ShortMessage();
            music3.setMessage(144, 4, 30, 90);
            MidiEvent noteOn2 = new MidiEvent(music3,1);
            track.add(noteOn2);
            ShortMessage stop3 = new ShortMessage();
            stop3.setMessage(128, 4, 30, 90);
            MidiEvent noteOff2 = new MidiEvent(stop3, 16);
            track.add(noteOff2);


            player.setSequence(seq);
            player.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
