package ch05_2;
import java.io.*;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        }catch (IIOException e){
            System.out.println("IOException: " + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputLine;
    }
}
