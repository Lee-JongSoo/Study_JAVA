package ch02_3;

class DrumKit{
    boolean topHat = true;
    boolean snare = true;
    void playTopHat(){
        System.out.println("ding ding da-ding");
    }
    void playSnare(){
        System.out.println("bang bang ba-bang");
    }
}
public class DrumKitTestDrive {
    public static void main(String[] args){
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        if(d.snare == true) d.playSnare();
        d.playTopHat();
        System.out.println("by 2017250035 이종수");
    }
}
