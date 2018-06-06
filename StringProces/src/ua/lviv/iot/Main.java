package ua.lviv.iot;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringProcesor stringProcesor = new StringProcesor();
        String finalStr = "";
        try{
            finalStr = stringProcesor.readInputText();
        } catch (IOException e){
            e.printStackTrace();
        }
        finalStr = stringProcesor.processText(finalStr);

        stringProcesor.showResult(finalStr);
    }
}
