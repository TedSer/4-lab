package ua.lviv.iot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcesor {
    public String readInputText() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string :");
        return bufferedReader.readLine();
    }
    public String processText(String inputText){
        String patern = "\\w+\\sN\\s\\d{2}\\.\\d{2}'\\d{2}\"\\sE\\s\\d{2}\\.\\d{2}'\\d{2}\"";
        StringBuilder finalString = new StringBuilder("");
        Matcher m = Pattern.compile(patern).matcher(inputText);

        while (m.find()){
            Matcher nameMatcher = Pattern.compile("\\w+\\s").matcher(m.group());
            nameMatcher.find();
            finalString.append(m.group().substring(nameMatcher.end()));
            finalString.append(" ");
        }
        return finalString.toString();
    }

    public void showResult(String resultText) {
        System.out.println("\nYour string:\n" + resultText);
    }

}
