package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
 begin by sorting it into alphabetical order.
 Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 For example, when the list is sorted into alphabetical order, COLIN, which is worth 3+15+12+9+14=53,is the 938th name in the list.
 So, COLIN would obtain a score of 938*53=49714.
 What is the total of all the name scores in the file?
*/
public class Problem22 {
    public static void main (String[] args){
        List<String> listNames = names(readFile());
        String name;
        int sum = 0;
        int nameScore = 0;
        for(int i = 0; i < listNames.size(); i++){
             name = listNames.get(i);
             if(i==0){
                 nameScore = characterValues(name);
             } else
                 nameScore = characterValues(name) * (i + 1);
             sum += nameScore;
             nameScore = 0;
        }
        System.out.println(sum);
    }

    static int characterValues(String name){
        int sum=0;
        for (int i=0; i <name.length(); i++){
            char a = name.charAt(i);
            sum += charToInt(a);
        }
        return sum;
    }

    static String readFile(){
        String file = "files/0022_names.txt";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            bufferedReader.close();
            fileReader.close();
            return line;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

    }
    static List<String> names(String line){
        String[] names = line.split(",");
        List<String> cleanNames = new ArrayList<>();
        for(String name : names){
            cleanNames.add( name.replaceAll("\"",""));
        }
        Collections.sort(cleanNames);
        return cleanNames;
    }

    static int charToInt (char a){
        int i = a - 'A' + 1;
        return i;
    }

}
