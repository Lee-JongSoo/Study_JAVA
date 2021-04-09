package ch04_3;

class Clock{
    String time;
    void setTime(String t){
        time = t;
    }
    String getTime(){
        return time;
    }
}

public class ClockTestDrive {
    public static void main(String[] args){
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
        System.out.print("by 2017250035 이종수");
    }
}
