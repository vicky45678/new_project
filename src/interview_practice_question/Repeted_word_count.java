package interview_practice_question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class Repeted_word_count {
    //Q== write a program how word are repeted in name

    public static void main(String[] args) throws Exception {
       String line, word= "";
       int count=0, maxCount=0;

        ArrayList<String> words = new ArrayList<String>();

        //open file in read mode
        FileReader file = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(file);

        //Read each line
        while ((line = br.readLine())!=null){
            String string[] = line.toLowerCase().split("([..\\s])+");
            //adding all words generated in previous step into
            for (String s : string){
                words.add(s);
            }
        }

        //determine the most repeated word in a file
        for (int i=0; i<words.size(); i++){
            count=1;

            //count each word in the file and store it in variable count
            for (int j=i+1; j<words.size(); j++){
                if(words.get(i).equals(words.get(j))){
                    count++;
                }
            }

            //if maxcount is less than count then store value of count in mqaxcount
            // and corresponding word to variable words
            if(count>maxCount){
                maxCount=count;
                word=words.get(i);
            }
        }
        System.out.println("most repeated word:" +word);
        br.close();

    }
}
